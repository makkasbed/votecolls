package com.votecolls.votecolls.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Party {
    @JsonProperty("id")
    UUID id;
    @JsonProperty("name")
    String name;
    @JsonProperty("initials")
    String initials;
    @JsonProperty("logo")
    String logo;
    @JsonProperty("mainColor")
    String mainColor;

    public Party(UUID id, String name, String initials, String logo, String mainColor) {
        this.id = id;
        this.name = name;
        this.initials = initials;
        this.logo = logo;
        this.mainColor = mainColor;
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

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }
}
