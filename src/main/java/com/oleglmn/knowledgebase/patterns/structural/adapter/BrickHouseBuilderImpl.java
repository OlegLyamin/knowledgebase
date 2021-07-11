package com.oleglmn.knowledgebase.patterns.structural.adapter;

import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class BrickHouseBuilderImpl implements BrickHouseBuilder {
    @Override
    public void build(Map<String, String> parameters) {
        System.out.println("Start building house with brick ...");
    }
}
