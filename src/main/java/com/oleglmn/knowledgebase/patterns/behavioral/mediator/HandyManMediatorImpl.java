package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Brick;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Concrete;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Place;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.WallDto;
import java.util.List;

public class HandyManMediatorImpl implements HandyManMediator {

    private BrickComponent brickComponent;
    private ConcreteComponent concreteComponent;
    private PlaceComponent placeComponent;

    @Override
    public void injectComponent(HandyManComponent component) {
        component.setMediator(this);
        switch (component.getComponentType()) {
            case "PlaceComponent":
                placeComponent = (PlaceComponent) component;
                break;
            case "BrickComponent":
                brickComponent = (BrickComponent) component;
                break;
            case "ConcreteComponent":
                concreteComponent = (ConcreteComponent) component;
                break;
        }
    }

    @Override
    public Concrete mixConcrete() {
        System.out.println(" Mix concrete ...");
        return concreteComponent == null ? null : concreteComponent.mixConcrete();
    }

    @Override
    public List<Brick> prepareBrick() {
        System.out.println(" Preparing bricks ...");
        return brickComponent == null ? null : brickComponent.getBricks();
    }

    @Override
    public Place preparePlace() {
        System.out.println(" Preparing place ...");
        return placeComponent == null ? null : placeComponent.preparePlace();
    }

    @Override
    public WallDto buildWall() {
        System.out.println(" Building wall ...");

        Place place = preparePlace();
        List<Brick> bricks = prepareBrick();
        Concrete concrete = mixConcrete();
        WallDto wallDto = new WallDto(concrete, bricks, place);
        System.out.println(" New wall: " + wallDto);
        return wallDto;
    }

    @Override
    public long getBrickCount() {
        return Math.round(preparePlace().getSquare() * 3);
    }

    @Override
    public Place getPlace() {
        return placeComponent.getPlace();
    }
}
