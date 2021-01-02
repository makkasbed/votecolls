package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.PartyDao;
import com.votecolls.votecolls.model.Party;
import com.votecolls.votecolls.model.Region;
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
        return jdbcTemplate.update("insert into party(name,initials,logo,mainColor)values(?,?,?,?)",new Object[]{
                p.getName(),
                p.getInitials(),
                p.getLogo(),
                p.getMainColor()
        });
    }

    @Override
    public List<Party> getAllParty() {
        final String sql="SELECT * from party";
        List<Party> party=jdbcTemplate.query(sql,(resultSet, i)->{
            return new Party(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getString("initials"),
                    resultSet.getString("logo"),resultSet.getString("mainColor"));
        });
        return party;
    }

    @Override
    public Optional<Party> getParty(UUID id) {
        final String sql="SELECT * from party where id=?";
        Party party=jdbcTemplate.queryForObject(sql,new Object[]{id},(resultSet, i)->{
            return new Party(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getString("initials"),
                    resultSet.getString("logo"),resultSet.getString("mainColor"));
        });
        return Optional.ofNullable(party);
    }

    @Override
    public int updateParty(UUID id, Party p) {
        return jdbcTemplate.update("update party set name=?,initials=?,logo=?,mainColor=? where id=?",
                new Object[]{
                      p.getName(),
                      p.getInitials(),
                      p.getLogo(),
                      p.getMainColor(),
                      p.getId()
                });
    }

    @Override
    public int deleteParty(UUID id) {
        return jdbcTemplate.update("delete from party where id=?",new Object[]{id});
    }
}
