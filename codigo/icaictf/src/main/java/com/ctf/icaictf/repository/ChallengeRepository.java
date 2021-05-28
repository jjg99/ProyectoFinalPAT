package com.ctf.icaictf.repository;

import com.ctf.icaictf.model.Challenge;
import com.ctf.icaictf.model.challengedata.ChallengeData;


import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface ChallengeRepository extends CrudRepository<Challenge, Integer>{
    
        // @Query("INSERT INTO \"CHALLENGES\" VALUES (:id, :difficulty, :username, :data)")
        // @Modifying
        // @Transactional
        // Boolean add(@Param("id") Integer id, @Param("difficulty") Integer difficulty, @Param("username") String username, @Param("data") String data);
}
