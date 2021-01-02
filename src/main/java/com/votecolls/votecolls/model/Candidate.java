package com.votecolls.votecolls.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Candidate {
   @JsonProperty("name")
   String name;
   @JsonProperty("photo")
   String photo;
   @JsonProperty("party_id")
   String party_id;
   @JsonProperty("constituency")
   String constituency;
   @JsonProperty("candidate_type")
   String candidate_type;
   @JsonProperty("election_id")
   String election;
   @JsonProperty("id")
   UUID id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getParty_id() {
        return party_id;
    }

    public void setParty_id(String party_id) {
        this.party_id = party_id;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getCandidate_type() {
        return candidate_type;
    }

    public void setCandidate_type(String candidate_type) {
        this.candidate_type = candidate_type;
    }

    public String getElection() {
        return election;
    }

    public void setElection(String election) {
        this.election = election;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Candidate(String name, String photo, String party_id, String constituency, String candidate_type,
                     String election, UUID id) {
        this.name = name;
        this.photo = photo;
        this.party_id = party_id;
        this.constituency=constituency;
        this.candidate_type=candidate_type;
        this.election=election;
        this.id=id;
    }


}
