package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Brick;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Concrete;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Place;
import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.WallDto;
import java.util.List;

public interface HandyManMediator {
    void injectComponent(HandyManComponent component);

    Concrete mixConcrete();

    List<Brick> prepareBrick();

    Place preparePlace();

    WallDto buildWall();

    long getBrickCount();

    Place getPlace();
}
