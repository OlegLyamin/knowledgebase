package com.oleglmn.knowledgebase.patterns.structural.facade;

import org.springframework.stereotype.Component;

@Component
public class OtherAdditionalFacadeImpl implements OtherAdditionalFacade {
    @Override
    public void doSomething() {
        System.out.println("Do something from additional facade...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
    }
}
