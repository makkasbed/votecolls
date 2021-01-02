package com.votecolls.votecolls.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

public class CandidateResult {
    @NonNull
    @JsonProperty("id")
    String candidate_id;
    @JsonProperty("total_votes")
    int totalVotes;

    public CandidateResult(String candidate_id, int totalVotes) {
        this.candidate_id = candidate_id;
        this.totalVotes = totalVotes;
    }

    public String getCandidate_id() {
        return candidate_id;
    }

    public void setCandidate_id(String candidate_id) {
        this.candidate_id = candidate_id;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
}
