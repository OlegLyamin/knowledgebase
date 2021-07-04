package com.oleglmn.knowledgebase.patterns.structural.decorator;

import com.oleglmn.knowledgebase.patterns.structural.proxy.ProxyApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class DecoratorApp {
    public static void main(String[] args) {
        Canvas canvas = new CanvasImpl();
        canvas.draw();

        System.out.println("-------");

        Canvas sky = new SkyDrawDecorator(new CanvasImpl());
        sky.draw();

        System.out.println("-------");

        Canvas mountain = new MountainDrawDecorator(new CanvasImpl());
        mountain.draw();

        System.out.println("-------");

        Canvas skyWithMountains = new MountainDrawDecorator(new SkyDrawDecorator(new CanvasImpl()));
        skyWithMountains.draw();
    }

}
