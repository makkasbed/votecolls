package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.CandidateDao;
import com.votecolls.votecolls.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
        return jdbcTemplate.update("insert into candidate(name,photo,party_id,constituency,candidate_type,election_id)" +
                "values(?,?,?,?,?,?)",candidate.getName(),candidate.getPhoto(),candidate.getParty_id(),candidate.getConstituency(),
                candidate.getCandidate_type(),candidate.getElection());
    }

    @java.lang.Override
    public List<Candidate> getCandidates() {
        final String sql="SELECT * from candidate";
        List<Candidate> candidates=jdbcTemplate.query(sql,(resultSet,i)->{
            return new Candidate(resultSet.getString("name"),resultSet.getString("photo"),
                    resultSet.getString("party_id"),resultSet.getString("constituency"),
                    resultSet.getString("candidate_type"),resultSet.getString("election_id"),
                    UUID.fromString(resultSet.getString("id")));
        });
        return candidates;
    }

    @java.lang.Override
    public Optional<Candidate> getCandidatesById(String id) {
        final String sql="SELECT * from candidate where id=?";
        Candidate candidate=jdbcTemplate.queryForObject(sql,new Object[]{id},(resultSet,i)->{
            return new Candidate(resultSet.getString("name"),resultSet.getString("photo"),
                    resultSet.getString("party_id"),resultSet.getString("constituency"),
                    resultSet.getString("candidate_type"),resultSet.getString("election_id"),
                    UUID.fromString(resultSet.getString("id")));
        });
        return Optional.ofNullable(candidate);
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByConstituency(String constituency_id) {
        final String sql="SELECT * from candidate where constituency=?";
        List<Candidate> candidates=jdbcTemplate.query(sql,new Object[]{constituency_id},(resultSet,i)->{
            return new Candidate(resultSet.getString("name"),resultSet.getString("photo"),
                    resultSet.getString("party_id"),resultSet.getString("constituency"),
                    resultSet.getString("candidate_type"),resultSet.getString("election_id"),
                    UUID.fromString(resultSet.getString("id")));
        });
        return candidates;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByElection(String election) {
        final String sql="SELECT * from candidate where election_id=?";
        List<Candidate> candidates=jdbcTemplate.query(sql,new Object[]{election},(resultSet,i)->{
            return new Candidate(resultSet.getString("name"),resultSet.getString("photo"),
                    resultSet.getString("party_id"),resultSet.getString("constituency"),
                    resultSet.getString("candidate_type"),resultSet.getString("election_id"),
                    UUID.fromString(resultSet.getString("id")));
        });
        return candidates;
    }

    @java.lang.Override
    public List<Candidate> getCandidatesByParty(String partyId) {
        final String sql="SELECT * from candidate where party_id=?";
        List<Candidate> candidates=jdbcTemplate.query(sql,new Object[]{partyId},(resultSet,i)->{
            return new Candidate(resultSet.getString("name"),
                    resultSet.getString("photo"),
                    resultSet.getString("party_id"),resultSet.getString("constituency"),
                    resultSet.getString("candidate_type"),
                    resultSet.getString("election_id"),
                    UUID.fromString(resultSet.getString("id")));
        });
        return candidates;
    }

    @java.lang.Override
    public int updateCandidate(int id, Candidate candidate) {
        return jdbcTemplate.update("UPDATE candidate set name=?,photo=?,party_id=?,constituency=?," +
                "candidate_type=?,election_id=? where id=?",new Object[]{
                        candidate.getName(),
                        candidate.getPhoto(),
                        candidate.getParty_id(),
                        candidate.getConstituency(),
                        candidate.getCandidate_type(),
                        candidate.getElection(),
                        candidate.getId()
        });
    }

    @java.lang.Override
    public int deleteCandidate(String id) {
        return jdbcTemplate.update("DELETE from candidate where id=?",new Object[]{id});
    }
}
