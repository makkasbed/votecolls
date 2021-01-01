package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Candidate;

import java.util.List;

public interface CandidateDao {
    public int addCandidate(Candidate candidate);
    public List<Candidate> getCandidates();
    public List<Candidate> getCandidatesById(String id);
    public List<Candidate> getCandidatesByConstituency(String constituency_id);
    public List<Candidate> getCandidatesByElection(String election);
    public List<Candidate> getCandidatesByParty(String partyId);
    public int updateCandidate(int id,Candidate candidate);
    public int deleteCandidate(String id);
}
