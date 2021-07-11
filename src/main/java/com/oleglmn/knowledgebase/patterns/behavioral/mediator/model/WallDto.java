package com.oleglmn.knowledgebase.patterns.behavioral.mediator.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WallDto {
    private Concrete concrete;
    private List<Brick> bricks;
    private Place place;
}
