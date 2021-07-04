package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.fuel;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketFuel;
import org.springframework.stereotype.Component;

@Component
public class RocketFuelerImpl implements RocketFueler {

    @Override
    public RocketFuel fillWithFuel(String RocketType, Double fullness) {
        System.out.println("Rocket fuel was fill ...");

        return null;
    }
}
