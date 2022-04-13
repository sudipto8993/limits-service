package com.boot.microservices.controller;

import com.boot.microservices.bean.LimitConfiguration;
import com.boot.microservices.com.boot.microservices.component.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }
}
