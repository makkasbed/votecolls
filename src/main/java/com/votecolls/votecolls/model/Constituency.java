package com.votecolls.votecolls.model;

import java.util.UUID;

public class Constituency {
    UUID id;
    String code;
    String name;
    String region_id;
    int totalVoters;
    int stationCount;

    public Constituency(UUID id,String code, String name, String region_id, int totalVoters,int stationCount) {
        this.id = id;
        this.name = name;
        this.region_id = region_id;
        this.totalVoters = totalVoters;
        this.code=code;
        this.stationCount=stationCount;
    }

    public int getStationCount() {
        return stationCount;
    }

    public void setStationCount(int stationCount) {
        this.stationCount = stationCount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id;
    }

    public int getTotalVoters() {
        return totalVoters;
    }

    public void setTotalVoters(int totalVoters) {
        this.totalVoters = totalVoters;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
