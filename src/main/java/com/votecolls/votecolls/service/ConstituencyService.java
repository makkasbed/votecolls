package com.votecolls.votecolls.service;

import com.votecolls.votecolls.dao.ConstituencyDao;
import com.votecolls.votecolls.model.Constituency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ConstituencyService {
    private final ConstituencyDao constituencyDao;

    @Autowired
    public ConstituencyService(ConstituencyDao constituencyDao) {
        this.constituencyDao = constituencyDao;
    }

    public int addConstituency(Constituency c)
    {
        return constituencyDao.addConstituency(c);
    }
    public List<Constituency> getConstituencyByRegion(String regionId)
    {
        return constituencyDao.getConstituencyByRegion(regionId);
    }
    public Optional<Constituency> getConstituency(UUID id)
    {
        return  constituencyDao.getConstituency(id);
    }
    public int updateConstituency(UUID id,Constituency c)
    {
        return constituencyDao.updateConstituency(id,c);
    }
    public int deleteConstituency(UUID id)
    {
        return constituencyDao.deleteConstituency(id);
    }
}
