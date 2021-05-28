package com.ctf.icaictf.repository;

import java.util.List;

import com.ctf.icaictf.model.Score;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PodiumRepository extends CrudRepository<Score, Long>{
    @Query("SELECT * FROM \"SCORES\" WHERE USERNAME= :username")
    List<Score> getScoresByUsername(@Param("username") String username); 
    
    @Query("SELECT * FROM \"SCORES\" WHERE ID= :challenge_id")
    List<Score> getScoresByChallenge(@Param("challenge_id") String challenge_id); 
}
