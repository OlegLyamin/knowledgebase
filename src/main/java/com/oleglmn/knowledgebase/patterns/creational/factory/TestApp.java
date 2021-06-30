package com.oleglmn.knowledgebase.patterns.creational.factory;

public class TestApp {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal cat = factory.getAnimal("cat");
        Animal dog = factory.getAnimal("dog");

        cat.makeSound();
        dog.makeSound();

    }
}
