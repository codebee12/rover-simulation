package com.rover.simulation.service;

import com.rover.simulation.domain.environment.Environment;
import de.danielbechler.diff.ObjectDifferBuilder;
import de.danielbechler.diff.node.DiffNode;
import de.danielbechler.diff.node.Visit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EnvironmentConfigService {

    private Environment environment;

    public void configureEnv(Environment environment)
    {
        this.environment = environment;
      //  this.environment.setTemperature(environment.getTemperature());
     //   System.out.println(this.environment.getTemperature());
        log.info("Temperature",environment.getTemperature());
    }

    public void patchEnv(Environment env)
    {
       // this.environment = env; // deep comparison required to patch things
        log.info("Temperature",environment.getTemperature());
        System.out.println(this.environment.getTemperature());
        System.out.println(this.environment.getAreaMap());

        //ToDo: Deep comparison and merge changes
        DiffNode diff = ObjectDifferBuilder.buildDefault().compare(env, environment);
        //set new env
        diff.visit(new DiffNode.Visitor()
        {
            public void node(DiffNode node, Visit visit)
            {
                // only leaf-nodes with changes
               /* if (node.hasChanges() && !node.hasChildren()) {

                }*/
                final Object baseValue = node.canonicalGet(environment);
                final Object workingValue = node.canonicalGet(env);
                final String message = node.getPath() + " changed from " +
                        baseValue + " to " + workingValue;
                System.out.println(message);
            }
        });
    }
}
