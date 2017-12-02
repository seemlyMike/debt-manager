package com.seemlymike.debtmanager.domain;

import org.springframework.data.annotation.Id;

public abstract class AbstractDocument {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
