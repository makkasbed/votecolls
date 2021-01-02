package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Election;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ElectionDao {
    public int addElection(Election election);
    public List<Election> getElections();
    public Optional<Election> getElection(UUID id);
    public List<Election> getElectionsByYear(String year);
    public int updateElection(UUID id,Election election);
    public int deleteElection(UUID id);

}
