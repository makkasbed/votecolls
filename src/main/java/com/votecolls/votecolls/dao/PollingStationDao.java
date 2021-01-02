package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.PollingStation;
import org.apache.tomcat.jni.Poll;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PollingStationDao {
    public int addPollingStation(PollingStation station);
    public List<PollingStation> getStations();
    public List<PollingStation> getStationsByConstituency(String constituency);
    public Optional<PollingStation> getStation(UUID id);
    public int updatePollingStation(UUID id,PollingStation station);
    public int deletePollingStation(UUID id);
}
