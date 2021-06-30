package com.oleglmn.knowledgebase.patterns.creational.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestComponent testComponent;

    @GetMapping("/test")
    public void test(){
        testComponent.showSingletonWork();
    }
}
