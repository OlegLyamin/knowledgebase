package com.oleglmn.knowledgebase.patterns.creational.prototype.lookup;

import java.util.UUID;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Status {
    private String status;
    private String defaultField;

    @Override
    public String toString() {
        return "Status{" +
            "status='" + status + '\'' +
            ", defaultField='" + defaultField + '\'' +
            '}';
    }

    public String getDefaultField() {
        return defaultField;
    }

    public Status() {
        defaultField = UUID.randomUUID().toString();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
