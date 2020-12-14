package com.rover.simulation.controller;

import com.rover.simulation.domain.environment.Environment;
import com.rover.simulation.service.EnvironmentConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/environment/")
public class EnvironmentController {

    @Autowired
    private EnvironmentConfigService environmentConfigService;

    @RequestMapping(method = {RequestMethod.POST},value ="/configure",consumes = "application/json")
    public ResponseEntity<String> configure(Environment environment)
    {
        this.environmentConfigService.configureEnv(environment);
        return ResponseEntity.ok("200");
    }

    @RequestMapping(method = {RequestMethod.PATCH},value ="",consumes = "application/json")
    public ResponseEntity<String> patchEnv(Environment environment)
    {
        //logic to patch
        return ResponseEntity.ok("200");
    }

}
