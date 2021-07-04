package com.oleglmn.knowledgebase.patterns.structural.proxy;

import com.oleglmn.knowledgebase.patterns.structural.facade.RocketSimulatorFacade;
import com.oleglmn.knowledgebase.patterns.structural.facade.RocketSimulatorFacadeImpl;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.Rocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rocketSimulatorProxy")
@Primary
public class RocketSimulatorFacadeProxy implements RocketSimulatorFacade {
    private long rocketsStartedCount;

    private final RocketSimulatorFacade rocketSimulatorFacade;

    public RocketSimulatorFacadeProxy(@Autowired @Qualifier("rocketSimulatorFacadeImpl") RocketSimulatorFacadeImpl rocketSimulatorFacade) {
        this.rocketSimulatorFacade = rocketSimulatorFacade;
    }

    @Override
    public Rocket launchRocket() {
        long startTime = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("Rocket Launching is starting from proxy...");
        Rocket rocket = rocketSimulatorFacade.launchRocket();
        System.out.println("Rocket Launching was start ...");
        long endTime = System.currentTimeMillis();
        System.out.println("\n");
        System.out.println("Rocket was launched from proxy with: " + (endTime-startTime) + " milliseconds");
        rocketsStartedCount ++;
        System.out.println("rocketsStartedCount: " + rocketsStartedCount);
        return rocket;
    }
}
