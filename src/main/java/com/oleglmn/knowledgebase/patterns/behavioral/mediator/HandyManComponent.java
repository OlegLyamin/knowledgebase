package com.oleglmn.knowledgebase.patterns.behavioral.mediator;

public interface HandyManComponent {
    void setMediator(HandyManMediator mediator);

    String getComponentType();
}
