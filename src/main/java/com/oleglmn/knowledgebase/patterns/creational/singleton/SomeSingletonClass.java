package com.oleglmn.knowledgebase.patterns.creational.singleton;

import org.springframework.stereotype.Component;

public class SomeSingletonClass {

    private String field1;

    @Override
    public String toString() {
        return "SomeSingletonClass{" +
            "field1='" + field1 + '\'' +
            '}';
    }

    public SomeSingletonClass() {
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
