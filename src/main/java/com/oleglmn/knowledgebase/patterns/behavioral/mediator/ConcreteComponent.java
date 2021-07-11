package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Concrete;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Place;

public class ConcreteComponent implements HandyManComponent {

    private HandyManMediator handyManMediator;

    public Concrete mixConcrete() {
        long brickCount = handyManMediator.getBrickCount();
        Place place = handyManMediator.getPlace();
        System.out.println("Counting kg for place: " + place + " with brickCount: " + brickCount);
        return new Concrete(20.5);
    }

    @Override
    public void setMediator(HandyManMediator mediator) {
        this.handyManMediator = mediator;
    }

    @Override
    public String getComponentType() {
        return "ConcreteComponent";
    }
}
