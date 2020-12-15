package com.rover.simulation.service;

import com.rover.simulation.domain.environment.Environment;
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
        this.environment = env;
        log.info("Temperature",environment.getTemperature());
        //set new env
    }
}
