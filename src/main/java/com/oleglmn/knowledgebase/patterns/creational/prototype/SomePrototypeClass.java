package com.oleglmn.knowledgebase.patterns.creational.prototype;

public class SomePrototypeClass {

    private String field1;

    @Override
    public String toString() {
        return "SomeSingletonClass{" +
            "field1='" + field1 + '\'' +
            '}';
    }

    public SomePrototypeClass() {
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
