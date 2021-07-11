package com.oleglmn.knowledgebase.patterns.creational.prototype.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class CheckStatus {

    @Lookup
    Status initStatus() {
        return null;
    }

    public void getStatus() {
        Status status = initStatus();
        status.setStatus("New status");

        System.out.println(status);

        Status status2 = initStatus();
        System.out.println(status2);
    }
}
