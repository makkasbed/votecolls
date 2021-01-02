package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.ElectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectionService {
    private final ElectionDao electionDao;

    @Autowired
    public ElectionService(ElectionDao electionDao) {
        this.electionDao = electionDao;
    }
}
