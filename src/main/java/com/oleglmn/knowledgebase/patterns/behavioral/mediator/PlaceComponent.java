package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Place;
import java.util.Random;

public class PlaceComponent implements HandyManComponent {
    private Place place;
    private HandyManMediator handyManMediator;
    private Random random = new Random();
    public Place preparePlace(){
        Place place = new Place(random.nextInt(10));
        this.place = place;
        return place;
    }

    @Override
    public void setMediator(HandyManMediator mediator) {
        this.handyManMediator = mediator;
    }

    @Override
    public String getComponentType() {
        return "PlaceComponent";
    }

    public Place getPlace() {
        return place;
    }

}
