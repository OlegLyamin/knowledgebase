package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

import com.oleglmn.knowledgebase.patterns.behavioral.mediator.model.Brick;
import java.util.ArrayList;
import java.util.List;

public class BrickComponent implements HandyManComponent {
    private HandyManMediator handyManMediator;

    public List<Brick> getBricks() {
        long brickCount = handyManMediator.getBrickCount();
        List<Brick> bricks = new ArrayList<>((int) brickCount);
        for (int i = 0; i < brickCount; i++) {
            bricks.add(new Brick("type1"));
        }
        return bricks;
    }

    @Override
    public void setMediator(HandyManMediator mediator) {
        this.handyManMediator = mediator;
    }

    @Override
    public String getComponentType() {
        return "BrickComponent";
    }
}
