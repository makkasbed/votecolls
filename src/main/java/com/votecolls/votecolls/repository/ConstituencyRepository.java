package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.ConstituencyDao;
import com.votecolls.votecolls.model.Candidate;
import com.votecolls.votecolls.model.Constituency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("constituencyrepo")
public class ConstituencyRepository implements ConstituencyDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ConstituencyRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addConstituency(Constituency constituency) {
        return jdbcTemplate.update("insert into constituency(code,name,region_id,total_voters,polling_station_count)" +
                "values(?,?,?,?,?)",new Object[]{
                  constituency.getCode(),
                  constituency.getName(),
                  constituency.getRegion_id(),
                  constituency.getTotalVoters(),
                  constituency.getStationCount()
        });
    }

    @Override
    public List<Constituency> getConstituencyByRegion(String region_id) {
        final String sql="SELECT * from constituency where region_id=?";
        List<Constituency> constituency=jdbcTemplate.query(sql,new Object[]{region_id},(resultSet, i)->{
            return new Constituency(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("code"),resultSet.getString("name"),
                    resultSet.getString("region_id"),resultSet.getInt("total_voters"),
                    resultSet.getInt("polling_station_count"));
        });
        return constituency;
    }

    @Override
    public Optional<Constituency> getConstituency(UUID id) {
        final String sql="SELECT * from constituency where id=?";
        Constituency constituency=jdbcTemplate.queryForObject(sql,new Object[]{id},(resultSet, i)->{
            return new Constituency(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("code"),resultSet.getString("name"),
                    resultSet.getString("region_id"),resultSet.getInt("total_voters"),
                    resultSet.getInt("polling_station_count"));
        });
        return Optional.ofNullable(constituency);
    }

    @Override
    public int updateConstituency(UUID id, Constituency constituency) {
        return jdbcTemplate.update("update constituency set code=?,name=?,region=?,total_voters=?,polling_station_count=? " +
                "where id=?",new Object[]{
                        constituency.getCode(),
                        constituency.getName(),
                        constituency.getRegion_id(),
                        constituency.getTotalVoters(),
                        constituency.getStationCount(),
                        constituency.getId()
        });
    }

    @Override
    public int deleteConstituency(UUID id) {
        return jdbcTemplate.update("Delete from constituency where id=?",new Object[]{id});
    }
}
