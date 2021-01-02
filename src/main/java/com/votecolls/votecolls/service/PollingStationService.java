package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.PollingStationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollingStationService {
    private final PollingStationDao pollingStationDao;

    @Autowired
    public PollingStationService(PollingStationDao pollingStationDao) {
        this.pollingStationDao = pollingStationDao;
    }
}
