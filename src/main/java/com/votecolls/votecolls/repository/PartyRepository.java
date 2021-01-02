package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.PartyDao;
import com.votecolls.votecolls.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("partyrepo")
public class PartyRepository implements PartyDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public PartyRepository(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public int addParty(Party p) {
        return 0;
    }

    @Override
    public List<Party> getAllParty() {
        return null;
    }

    @Override
    public Optional<Party> getParty(UUID id) {
        return Optional.empty();
    }

    @Override
    public int updateParty(UUID id, Party p) {
        return 0;
    }

    @Override
    public int deleteParty(UUID id) {
        return 0;
    }
}
