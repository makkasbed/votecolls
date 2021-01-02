package com.votecolls.votecolls.model;

import java.util.List;

public class Results {
    String polling_station;
    String pinkSheet;
    String userId;
    int totalVoted;
    int totalValid;
    int totalInvalid;
    String election;

    List<CandidateResult> candidateResultList;

    public Results(String polling_station, String pinkSheet, String userId, int totalVoted, int totalValid, int totalInvalid, String election, List<CandidateResult> candidateResultList) {
        this.polling_station = polling_station;
        this.pinkSheet = pinkSheet;
        this.userId = userId;
        this.totalVoted = totalVoted;
        this.totalValid = totalValid;
        this.totalInvalid = totalInvalid;
        this.election = election;
        this.candidateResultList = candidateResultList;
    }

    public String getPolling_station() {
        return polling_station;
    }

    public void setPolling_station(String polling_station) {
        this.polling_station = polling_station;
    }

    public String getPinkSheet() {
        return pinkSheet;
    }

    public void setPinkSheet(String pinkSheet) {
        this.pinkSheet = pinkSheet;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getTotalVoted() {
        return totalVoted;
    }

    public void setTotalVoted(int totalVoted) {
        this.totalVoted = totalVoted;
    }

    public int getTotalValid() {
        return totalValid;
    }

    public void setTotalValid(int totalValid) {
        this.totalValid = totalValid;
    }

    public int getTotalInvalid() {
        return totalInvalid;
    }

    public void setTotalInvalid(int totalInvalid) {
        this.totalInvalid = totalInvalid;
    }

    public String getElection() {
        return election;
    }

    public void setElection(String election) {
        this.election = election;
    }

    public List<CandidateResult> getCandidateResultList() {
        return candidateResultList;
    }

    public void setCandidateResultList(List<CandidateResult> candidateResultList) {
        this.candidateResultList = candidateResultList;
    }
}
