package com.oleglmn.knowledgebase.patterns.structural.decorator;

public abstract class CanvasDecorator implements Canvas {
    private final Canvas canvas;

    public CanvasDecorator(Canvas canvas) {
        this.canvas = canvas;
    }

    @Override
    public void draw() {
        canvas.draw();
    }
}
