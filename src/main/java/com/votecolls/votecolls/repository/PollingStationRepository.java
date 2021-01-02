package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.PollingStationDao;
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

    public PollingStationRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Autowired

    @Override
    public int addPollingStation(PollingStation station) {
        return 0;
    }

    @Override
    public List<PollingStation> getStations() {
        return null;
    }

    @Override
    public List<PollingStation> getStationsByConstituency(String constituency) {
        return null;
    }

    @Override
    public Optional<PollingStation> getStation(UUID id) {
        return Optional.empty();
    }

    @Override
    public int updatePollingStation(UUID id,PollingStation station) {
        return 0;
    }

    @Override
    public int deletePollingStation(UUID id) {
        return 0;
    }
}
