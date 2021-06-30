package com.oleglmn.knowledgebase.patterns.structural.bridge;

public class SingerImpl implements Singer {
    @Override
    public void makeSound(Song song) {
        song.playingSound();
    }
}
