package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.PartyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    private final PartyDao partyDao;

    @Autowired
    public PartyService(PartyDao partyDao) {
        this.partyDao = partyDao;
    }
}
