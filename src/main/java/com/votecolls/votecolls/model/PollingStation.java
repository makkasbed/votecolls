package com.votecolls.votecolls.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PollingStation {
    @JsonProperty("code")
    String code;
    @JsonProperty("name")
    String name;
    @JsonProperty("constituency")
    String constituency;
    @JsonProperty("total_votes")
    int totalVotes;


    public PollingStation(String code, String name, String constituency) {
        this.code = code;
        this.name = name;
        this.constituency = constituency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }
}
