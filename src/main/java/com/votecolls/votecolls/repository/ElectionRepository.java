package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.ElectionDao;
import com.votecolls.votecolls.model.Election;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("electionrepo")
public class ElectionRepository implements ElectionDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ElectionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addElection(Election election) {
        return 0;
    }

    @Override
    public List<Election> getElections() {
        return null;
    }

    @Override
    public Optional<Election> getElection(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Election> getElectionsByYear(String year) {
        return null;
    }

    @Override
    public int updateElection(UUID id, Election election) {
        return 0;
    }

    @Override
    public int deleteElection(UUID id) {
        return 0;
    }
}
