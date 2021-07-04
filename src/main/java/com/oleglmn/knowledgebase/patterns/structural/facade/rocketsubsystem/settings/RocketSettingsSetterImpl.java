package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.settings;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketSettings;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class RocketSettingsSetterImpl implements RocketSettingsSetter {
    @Override
    public RocketSettings setSettings(Map<String, String> settings) {
        System.out.println("Rocket settings was set ...");
        return null;
    }
}
