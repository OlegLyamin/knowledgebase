package com.oleglmn.knowledgebase.patterns.creational.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    @Autowired
    ApplicationContext applicationContext;

    public void showPrototypeWork(){
        SomePrototypeClass
            somePrototypeClass = (SomePrototypeClass) applicationContext.getBean("test");
        somePrototypeClass.setField1("Another value");
        System.out.println(somePrototypeClass);
        System.out.println(somePrototypeClass.hashCode());
        SomePrototypeClass somePrototypeClass2 = (SomePrototypeClass) applicationContext.getBean("test");
        System.out.println(somePrototypeClass2.hashCode());


        System.out.println(somePrototypeClass2);

    }
}
