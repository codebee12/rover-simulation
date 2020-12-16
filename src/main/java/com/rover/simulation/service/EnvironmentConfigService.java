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
        log.info("Temperature",environment.getTemperature());
    }

    public void patchEnv(Environment env)
    {
        DiffNode diff = ObjectDifferBuilder.buildDefault().compare(env, environment);
        //set new env
        diff.visit(new DiffNode.Visitor()
        {
            public void node(DiffNode node, Visit visit)
            {
                //ToDo: Update only for changed ones, handled null, boolean params remain
                // only leaf-nodes with changes
                if (node.hasChanges() && !node.hasChildren()) {
                    System.out.println(node.getPath() + "changed");
                    if(node.canonicalGet(env) !=null)
                        node.canonicalSet(environment, node.canonicalGet(env));
                }
                /*final Object baseValue = node.canonicalGet(environment);
                final Object workingValue = node.canonicalGet(env);
                final String message = node.getPath() + " changed from " +
                        baseValue + " to " + workingValue;
                System.out.println(message);*/
                System.out.println(environment.getTemperature());
                System.out.println(environment.isSolarFlare());
            }
        });
    }
}
