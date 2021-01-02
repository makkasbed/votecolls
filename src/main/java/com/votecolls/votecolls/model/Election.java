package com.votecolls.votecolls.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Election {
   @JsonProperty("id")
   UUID id;
   @JsonProperty("name")
   String electionname;
   @JsonProperty("year")
   String year;
   @JsonProperty("election_type")
   String electiontype;

    public Election(UUID id, String electionname, String year, String electiontype) {
        this.id = id;
        this.electionname = electionname;
        this.year = year;
        this.electiontype = electiontype;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getElectionname() {
        return electionname;
    }

    public void setElectionname(String electionname) {
        this.electionname = electionname;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getElectiontype() {
        return electiontype;
    }

    public void setElectiontype(String electiontype) {
        this.electiontype = electiontype;
    }
}
