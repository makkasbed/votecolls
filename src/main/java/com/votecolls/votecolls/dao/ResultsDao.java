package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Results;

import java.util.List;
import java.util.UUID;

public interface ResultsDao {
    public int addResults(Results r);
    public List<Results> getResults();
    public List<Results> getResultsByElection(String id);
    public int updateResults(UUID id,Results r);
    public int deleteResults(UUID id);
}
