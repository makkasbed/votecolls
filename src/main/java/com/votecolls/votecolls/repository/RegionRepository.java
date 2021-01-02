package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.RegionDao;
import com.votecolls.votecolls.model.Constituency;
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
        return jdbcTemplate.update("insert into region(name,constituencies)values(?,?)",new Object[]{
                r.getName(),
                r.getConstituencies()
        });
    }

    @Override
    public List<Region> getRegions() {
        final String sql="SELECT * from region";
        List<Region> regions=jdbcTemplate.query(sql,(resultSet, i)->{
            return new Region(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getInt("constituencies"));
        });
        return regions;
    }

    @Override
    public int updateRegion(UUID id, Region r) {
        return jdbcTemplate.update("update region set name=?,constituencies=? where id=?",new Object[]{
                r.getName(),
                r.getConstituencies(),
                r.getId()
        });
    }

    @Override
    public int deleteRegion(UUID id) {
        return jdbcTemplate.update("delete from region where id=?",new Object[]{id});
    }
}
