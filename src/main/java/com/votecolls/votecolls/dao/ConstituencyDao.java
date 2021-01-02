package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Constituency;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ConstituencyDao {
    public int addConstituency(Constituency constituency);
    public List<Constituency> getConstituencyByRegion(String region_id);
    public Optional<Constituency> getConstituency(UUID id);
    public int updateConstituency(UUID id,Constituency constituency);
    public int deleteConstituency(UUID id);
}
