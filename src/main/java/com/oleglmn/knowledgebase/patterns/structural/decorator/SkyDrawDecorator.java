package com.oleglmn.knowledgebase.patterns.structural.decorator;

public class SkyDrawDecorator extends CanvasDecorator {

    public SkyDrawDecorator(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void draw() {
        super.draw();
        drawSkyOnCanvas();
    }

    private void drawSkyOnCanvas() {
        System.out.println("Drawing sky ...");
    }
}
