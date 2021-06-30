package com.oleglmn.knowledgebase.patterns.creational.prototype;

import com.oleglmn.knowledgebase.patterns.creational.prototype.lookup.CheckStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestComponent testComponent;

    @Autowired
    CheckStatus checkStatus;

    @GetMapping("/test")
    public void test(){
        testComponent.showPrototypeWork();
    }

    @GetMapping("/lookup")
    public void test2(){
        checkStatus.getStatus();
    }
}
