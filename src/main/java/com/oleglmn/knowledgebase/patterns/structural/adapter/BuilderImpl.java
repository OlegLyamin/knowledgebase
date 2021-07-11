package com.oleglmn.knowledgebase.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BuilderImpl implements Builder {
    private final BrickHouseBuilder brickHouseBuilder;
    private final IronHouseBuilderAdapter ironHouseBuilderAdapter;
    private static final Random random = new Random();
    @Override
    public void buildHouse(Map<String, String> parameters) {

        List<BuilderType> builderTypes = Arrays.asList(BuilderType.values());
        for(int i = 0; i < 10; i++){
            int randomSize = random.nextInt(builderTypes.size());
            if(builderTypes.get(randomSize).equals(BuilderType.BRICK)){
                brickHouseBuilder.build(parameters);
            } else{
                ironHouseBuilderAdapter.build(parameters);
            }
        }
        System.out.println("--------------------------------------------");

    }
}
