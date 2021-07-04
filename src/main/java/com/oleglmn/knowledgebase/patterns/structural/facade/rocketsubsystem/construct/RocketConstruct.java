package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.construct;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.Rocket;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketMachine;

public interface RocketConstruct {
    RocketMachine buildRocket();
}
