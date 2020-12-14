package com.rover.simulation.service;

import com.rover.simulation.domain.environment.Environment;
import org.springframework.stereotype.Service;

@Service
public class EnvironmentConfigService {

    private Environment environment;

    public void configureEnv(Environment environment)
    {
        this.environment = environment;
    }

    public void patchEnv(Environment env)
    {
        //set new env
    }
}
