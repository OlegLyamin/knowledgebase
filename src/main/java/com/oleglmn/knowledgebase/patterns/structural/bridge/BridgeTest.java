package com.oleglmn.knowledgebase.patterns.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        Singer rapper = new SingerImpl();
        rapper.makeSound(new RapSongImpl());

        Singer rocker = new SingerImpl();
        rocker.makeSound(new RockSongImpl());
    }
}
