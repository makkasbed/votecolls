package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.ResultsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsService {
    private final ResultsDao resultsDao;

    @Autowired
    public ResultsService(ResultsDao resultsDao) {
        this.resultsDao = resultsDao;
    }
}
