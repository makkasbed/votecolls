package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.CandidateDao;
import com.votecolls.votecolls.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("candidaterepo")
public class CandidateRepository implements CandidateDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CandidateRepository(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }

    @java.lang.Override
    public int addCandidate(Candidate candidate) {
        return 0;
    }

    @java.lang.Override
    public List<Candidate> getCandidates() {
        final String sql="SELECT * from candidate";
        List<Candidate> candidates=jdbcTemplate.query(sql,(resultSet,i)->{
            return new Candidate();
        });
        return candidates;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesById(String id) {
        return null;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByConstituency(String constituency_id) {
        return null;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByElection(String election) {
        return null;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByParty(String partyId) {
        return null;
    }

    @java.lang.Override
    public int updateCandidate(int id, Candidate candidate) {
        return 0;
    }

    @java.lang.Override
    public int deleteCandidate(String id) {
        return 0;
    }
}
