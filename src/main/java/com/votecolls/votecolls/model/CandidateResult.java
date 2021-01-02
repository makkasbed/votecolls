package com.votecolls.votecolls.model;

public class CandidateResult {
    String candidate_id;
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
