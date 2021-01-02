package com.votecolls.votecolls.repository;

import com.votecolls.votecolls.dao.ElectionDao;
import com.votecolls.votecolls.model.Election;
import com.votecolls.votecolls.model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("electionrepo")
public class ElectionRepository implements ElectionDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ElectionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addElection(Election election) {

        return jdbcTemplate.update("insert into election(name,year,election_type)values(?,?,?)",new Object[]{
                election.getElectionname(),
                election.getYear(),
                election.getElectiontype()
        });
    }

    @Override
    public List<Election> getElections() {

        final String sql="SELECT * from election";
        List<Election> elections=jdbcTemplate.query(sql,(resultSet, i)->{
            return new Election(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getString("year"),
                    resultSet.getString("election_type"));
        });
        return elections;
    }

    @Override
    public Optional<Election> getElection(UUID id) {

        final String sql="SELECT * from election where id=?";
        Election election=jdbcTemplate.queryForObject(sql,(resultSet, i)->{
            return new Election(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getString("year"),
                    resultSet.getString("election_type"));
        });
        return Optional.ofNullable(election);
    }

    @Override
    public List<Election> getElectionsByYear(String year) {
        final String sql="SELECT * from election where year=?";
        List<Election> elections=jdbcTemplate.query(sql,new Object[]{year},(resultSet, i)->{
            return new Election(UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("name"),resultSet.getString("year"),
                    resultSet.getString("election_type"));
        });
        return elections;
    }

    @Override
    public int updateElection(UUID id, Election election) {

        return jdbcTemplate.update("update election set name=?,year=?,election_type=? where id=?",new Object[]{
                election.getElectionname(),
                election.getYear(),
                election.getElectiontype(),
                election.getId()
        });
    }

    @Override
    public int deleteElection(UUID id) {

        return jdbcTemplate.update("delete from election where id=?",new Object[]{id});
    }
}
