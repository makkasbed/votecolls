package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.PollingStationDao;
import com.votecolls.votecolls.model.Constituency;
import com.votecolls.votecolls.model.PollingStation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("pollingrepo")
public class PollingStationRepository implements PollingStationDao {
    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public PollingStationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public int addPollingStation(PollingStation station) {
        return jdbcTemplate.update("insert into polling_station(code,name,constituency,total_voters)" +
                "values(?,?,?,?)",new Object[]{
                        station.getCode(),
                        station.getName(),
                        station.getConstituency(),
                        station.getTotalVotes()
        });
    }

    @Override
    public List<PollingStation> getStations() {
        final String sql="SELECT * from polling_station";
        List<PollingStation> station=jdbcTemplate.query(sql,(resultSet, i)->{
            return new PollingStation(
                    resultSet.getString("code"),resultSet.getString("name"),
                    resultSet.getString("constituency"),resultSet.getInt("total_voters"));
        });
        return station;
    }

    @Override
    public List<PollingStation> getStationsByConstituency(String constituency) {
        final String sql="SELECT * from polling_station where constituency=?";
        List<PollingStation> station=jdbcTemplate.query(sql,new Object[]{constituency},(resultSet, i)->{
            return new PollingStation(
                    resultSet.getString("code"),resultSet.getString("name"),
                    resultSet.getString("constituency"),resultSet.getInt("total_voters"));
        });
        return station;
    }

    @Override
    public Optional<PollingStation> getStation(UUID id) {
        final String sql="SELECT * from polling_station where id=?";
        PollingStation station=jdbcTemplate.queryForObject(sql,new Object[]{id},(resultSet, i)->{
            return new PollingStation(
                    resultSet.getString("code"),resultSet.getString("name"),
                    resultSet.getString("constituency"),resultSet.getInt("total_voters"));
        });
        return Optional.ofNullable(station);
    }

    @Override
    public int updatePollingStation(UUID id,PollingStation station) {
        return jdbcTemplate.update("update polling_station set name=?,constituency=?,total_votes=? where code=?",new Object[]{
                station.getName(),
                station.getConstituency(),
                station.getTotalVotes(),
                station.getCode()
        });
    }

    @Override
    public int deletePollingStation(UUID id) {
        return jdbcTemplate.update("delete from polling_station where id=?",new Object[]{id});
    }
}
