package com.oleglmn.knowledgebase.patterns.structural.bridge;

public class RockSongImpl implements Song {
    @Override
    public void playingSound() {
        System.out.println("It's a rock");
    }
}
