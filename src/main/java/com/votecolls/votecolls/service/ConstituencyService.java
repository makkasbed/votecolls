package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.ConstituencyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConstituencyService {
    private final ConstituencyDao constituencyDao;

    @Autowired
    public ConstituencyService(ConstituencyDao constituencyDao) {
        this.constituencyDao = constituencyDao;
    }
}
