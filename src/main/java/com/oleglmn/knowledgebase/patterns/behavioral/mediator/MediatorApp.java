package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        HandyManMediator handyManMediator = new HandyManMediatorImpl();
        handyManMediator.injectComponent(new BrickComponent());
        handyManMediator.injectComponent(new ConcreteComponent());
        handyManMediator.injectComponent(new PlaceComponent());
        handyManMediator.buildWall();
    }
}
