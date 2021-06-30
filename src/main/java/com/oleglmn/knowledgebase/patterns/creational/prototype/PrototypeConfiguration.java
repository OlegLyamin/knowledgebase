package com.oleglmn.knowledgebase.patterns.creational.prototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PrototypeConfiguration {

    @Bean(name = "test")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public SomePrototypeClass getPrototypeClass() {
        SomePrototypeClass somePrototypeClass = new SomePrototypeClass();
        somePrototypeClass.setField1("From initialization place");
        return somePrototypeClass;
    }
}
