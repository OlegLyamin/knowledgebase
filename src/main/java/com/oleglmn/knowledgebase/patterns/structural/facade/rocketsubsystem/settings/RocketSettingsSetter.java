package com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.settings;

import com.oleglmn.knowledgebase.patterns.structural.facade.rocketsubsystem.model.RocketSettings;
import java.util.Map;
import org.springframework.stereotype.Component;

public interface RocketSettingsSetter {
    RocketSettings setSettings(Map<String, String> settings);
}
