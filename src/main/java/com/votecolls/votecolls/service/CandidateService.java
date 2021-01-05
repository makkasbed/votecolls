package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.CandidateDao;
import com.votecolls.votecolls.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CandidateService {
    private final CandidateDao candidateDao;

    @Autowired
    public CandidateService(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }

    public int addCandidate(Candidate c)
    {
        return candidateDao.addCandidate(c);
    }
    public List<Candidate> getCandidates()
    {
        return candidateDao.getCandidates();
    }
    public Optional<Candidate> getCandidatesById(UUID id)
    {
        return candidateDao.getCandidatesById(id.toString());
    }
    public List<Candidate> getCandidatesByConstituency(String constituency)
    {
        return candidateDao.getCandidatesByConstituency(constituency);
    }
    public List<Candidate> getCandidatesByParty(String partyId)
    {
        return candidateDao.getCandidatesByParty(partyId);
    }
    public List<Candidate> getCandidatesByElection(String election)
    {
        return candidateDao.getCandidatesByElection(election);
    }
    public int updateCandidate(UUID id,Candidate c)
    {
        return candidateDao.updateCandidate(id,c);
    }
    public int deleteCandidate(UUID id)
    {
        return candidateDao.deleteCandidate(id.toString());
    }
}
