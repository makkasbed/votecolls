package com.votecolls.votecolls.dao;

import com.votecolls.votecolls.model.Party;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PartyDao {
    public int addParty(Party p);
    public List<Party> getAllParty();
    public Optional<Party> getParty(UUID id);
    public int updateParty(UUID id,Party p);
    public int deleteParty(UUID id);
}
