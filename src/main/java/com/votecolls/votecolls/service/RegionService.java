package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.RegionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    private final RegionDao regionDao;

    @Autowired
    public RegionService(RegionDao regionDao) {
        this.regionDao = regionDao;
    }
}
