package com.oleglmn.knowledgebase.patterns.creational.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    @Autowired
    ApplicationContext applicationContext;

    public void showSingletonWork(){
        SomeSingletonClass someSingletonClass = (SomeSingletonClass) applicationContext.getBean("test");
        someSingletonClass.setField1("Another value");
        System.out.println(someSingletonClass);
        System.out.println(someSingletonClass.hashCode());
        SomeSingletonClass someSingletonClass2 = (SomeSingletonClass) applicationContext.getBean("test");
        System.out.println(someSingletonClass2);
        System.out.println(someSingletonClass2.hashCode());

    }
}
