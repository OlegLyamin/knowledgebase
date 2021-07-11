package com.oleglmn.knowledgebase.patterns.structural.adapter.builderContractors;

import java.util.Map;

public interface IronHouseBuilder {
    void build(Map<String, String> parameters, int buildersCount, String ironType);
}
