package com.oleglmn.knowledgebase.patterns.structural.facade;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RocketController {
    private final RocketSimulatorFacade rocketSimulatorFacade;

    @GetMapping("/test")
    public void test() {
        rocketSimulatorFacade.launchRocket();
    }
}

