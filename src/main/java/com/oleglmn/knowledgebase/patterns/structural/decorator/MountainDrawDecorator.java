package com.oleglmn.knowledgebase.patterns.structural.decorator;

public class MountainDrawDecorator extends CanvasDecorator {
    public MountainDrawDecorator(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void draw() {
        super.draw();
        drawMountainsOnCanvas();
    }

    private void drawMountainsOnCanvas() {
        System.out.println("Drawing Mountains ...");
    }
}
