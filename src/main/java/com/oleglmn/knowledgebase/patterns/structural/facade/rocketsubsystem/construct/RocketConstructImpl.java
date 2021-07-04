package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.construct;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.Rocket;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketMachine;
import org.springframework.stereotype.Component;

@Component
public class RocketConstructImpl implements RocketConstruct {
    @Override
    public RocketMachine buildRocket() {
        System.out.println("Rocket machine was build ...");

        return null;
    }
}
