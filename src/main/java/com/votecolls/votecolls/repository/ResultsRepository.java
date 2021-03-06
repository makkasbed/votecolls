package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.ResultsDao;
import com.votecolls.votecolls.model.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("resultsrepo")
public class ResultsRepository implements ResultsDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public ResultsRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addResults(Results r) {
        return 0;
    }

    @Override
    public List<Results> getResults() {
        return null;
    }

    @Override
    public List<Results> getResultsByElection(String id) {
        return null;
    }

    @Override
    public int updateResults(UUID id,Results r) {
        return 0;
    }

    @Override
    public int deleteResults(UUID id) {
        return 0;
    }
}
