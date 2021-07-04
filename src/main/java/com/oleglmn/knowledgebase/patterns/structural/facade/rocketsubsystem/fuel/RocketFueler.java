package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.fuel;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketFuel;

public interface RocketFueler {
    RocketFuel fillWithFuel(String RocketType, Double fullness);
}
