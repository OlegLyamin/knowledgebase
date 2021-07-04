package com.oleglmn.knowledgebase.patterns.structural.proxy;

import com.oleglmn.knowledgebase.patterns.structural.facade.RocketSimulatorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyController {

    private final RocketSimulatorFacade facade;

    public ProxyController(@Autowired
                           @Qualifier("rocketSimulatorFacadeProxy") RocketSimulatorFacadeProxy proxy) {
        this.facade = proxy;
    }

    @GetMapping("/proxy/test")
    public void test() {
        facade.launchRocket();
    }
}

