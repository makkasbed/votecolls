package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.RegionDao;
import com.votecolls.votecolls.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("regionrepo")
public class RegionRepository implements RegionDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public RegionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addRegion(Region r) {
        return 0;
    }

    @Override
    public List<Region> getRegions() {
        return null;
    }

    @Override
    public int updateRegion(UUID id, Region r) {
        return 0;
    }

    @Override
    public int deleteRegion(UUID id) {
        return 0;
    }
}
