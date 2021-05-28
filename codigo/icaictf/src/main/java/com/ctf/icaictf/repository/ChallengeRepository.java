package com.ctf.icaictf.repository;

import com.ctf.icaictf.model.Challenge;

import org.springframework.data.repository.CrudRepository;

public interface ChallengeRepository extends CrudRepository<Challenge, Integer>{
    
        // @Query("INSERT INTO \"CHALLENGES\" VALUES (:id, :difficulty, :username, :data)")
        // @Modifying
        // @Transactional
        // Boolean add(@Param("id") Integer id, @Param("difficulty") Integer difficulty, @Param("username") String username, @Param("data") String data);
}
