package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Region;

import java.util.List;
import java.util.UUID;

public interface RegionDao {
    public int addRegion(Region r);
    public List<Region> getRegions();
    public int updateRegion(UUID id, Region r);
    public int deleteRegion(UUID id);
}
