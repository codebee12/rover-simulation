package com.rover.simulation.controller;

import com.rover.simulation.domain.environment.Environment;
import com.rover.simulation.service.EnvironmentConfigService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/environment/")
public class EnvironmentController {

    private EnvironmentConfigService environmentConfigService;

    @RequestMapping(method = {RequestMethod.POST},value ="/configure")
    public ResponseEntity<Environment> configure()
    {

        return null;
    }

}
