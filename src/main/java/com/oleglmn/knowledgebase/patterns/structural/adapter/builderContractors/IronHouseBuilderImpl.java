package com.oleglmn.knowledgebase.patterns.structural.adapter.builderContractors;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class IronHouseBuilderImpl implements IronHouseBuilder {
    @Override
    public void build(Map<String, String> parameters, int buildersCount, String ironType) {
        System.out.println("Start building house with iron with buildersCount: " + buildersCount + " with type: " + ironType);

    }
}
