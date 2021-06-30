package com.oleglmn.knowledgebase.patterns.creational.singleton;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingletonConfiguration {

    @Bean(name = "test")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SomeSingletonClass getSingletonClass() {
        return new SomeSingletonClass();
    }
}
