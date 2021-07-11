package com.oleglmn.knowledgebase.patterns.structural.adapter;

import com.oleglmn.knowledgebase.patterns.structural.adapter.builderContractors.IronHouseBuilder;
import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class IronHouseBuilderAdapterImpl implements IronHouseBuilderAdapter {
    private final IronHouseBuilder ironHouseBuilder;
    @Override
    public void build(Map<String, String> parameters) {
        System.out.println("Getting buildersCount and ironType from parameters ...");
        ironHouseBuilder.build(parameters, 10, "SomeType");
    }
}
