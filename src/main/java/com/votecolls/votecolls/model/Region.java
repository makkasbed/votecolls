package com.votecolls.votecolls.model;

import java.util.UUID;

public class Region {
    UUID id;
    String name;
    int constituencies;

    public Region(UUID id, String name, int constituencies) {
        this.id = id;
        this.name = name;
        this.constituencies = constituencies;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConstituencies() {
        return constituencies;
    }

    public void setConstituencies(int constituencies) {
        this.constituencies = constituencies;
    }
}
