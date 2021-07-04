package com.oleglmn.knowledgebase.patterns.structural.facade;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.construct.RocketConstruct;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.fuel.RocketFueler;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.Rocket;
import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.settings.RocketSettingsSetter;
import java.util.HashMap;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Qualifier("rocketSimulatorFacadeImpl")
public class RocketSimulatorFacadeImpl implements RocketSimulatorFacade {
    private final RocketConstruct rocketConstruct;
    private final RocketSettingsSetter rocketSettingsSetter;
    private final RocketFueler rocketFueler;
    private final OtherAdditionalFacade otherAdditionalFacade;


    @Override
    public Rocket launchRocket() {
        Rocket rocket = new Rocket();

        rocket.setRocketMachine(rocketConstruct.buildRocket());
        rocket.setRocketFuel(rocketFueler.fillWithFuel("BIG_ROCKET", 1000.199));
        rocket.setRocketSettings(this.rocketSettingsSetter.setSettings(new HashMap<>()));
        rocket.setName("Super Rocket !!!");
        rocket.setTargetPlace("Moon");

        otherAdditionalFacade.doSomething();

        rocket.launchRocket();

        return rocket;
    }
}
