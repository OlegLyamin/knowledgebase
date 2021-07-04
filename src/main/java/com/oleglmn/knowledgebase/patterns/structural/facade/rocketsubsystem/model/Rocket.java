package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model;

import lombok.Data;

@Data
public class Rocket {

    private String name;
    private String targetPlace;
    private String rocketStatus;

    private RocketSettings rocketSettings;
    private RocketFuel rocketFuel;
    private RocketMachine rocketMachine;

    public void launchRocket(){
        this.rocketStatus = "STARTED";
        System.out.println("Rocket was launched with name: " + name + " to " + targetPlace);
    }
}
