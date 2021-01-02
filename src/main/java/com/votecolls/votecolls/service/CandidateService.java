package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.CandidateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {
    private final CandidateDao candidateDao;

    @Autowired
    public CandidateService(CandidateDao candidateDao) {
        this.candidateDao = candidateDao;
    }
}
