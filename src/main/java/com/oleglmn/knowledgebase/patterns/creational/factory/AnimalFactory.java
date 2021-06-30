package com.oleglmn.knowledgebase.patterns.creational.factory;

public class AnimalFactory {

    public Animal getAnimal(String animal) {
        if (animal.equals("cat")) {
            return new Cat();
        } else return new Dog();
    }

}
