package com.oleglmn.knowledgebase.patterns.structural.adapter;

import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final Builder builder;

    public Controller(Builder builder) {
        this.builder = builder;
    }

    @GetMapping("/test")
    public void test() {
        builder.buildHouse(new HashMap<>());
    }
}
