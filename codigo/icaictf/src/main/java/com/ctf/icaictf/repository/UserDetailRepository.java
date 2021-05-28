package com.ctf.icaictf.repository;

import com.ctf.icaictf.model.UserDetail;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetail, String> {
    @Query("SELECT * FROM \"USERS\" WHERE USERNAME= :username")
    UserDetail getUserByUsername(@Param("username") String username);

    @Query("UPDATE USERS SET USERS.password= :password WHERE USERS.username= :username")
    @Modifying
    boolean updatePassword(@Param("username") String username, @Param("password") String password);

    @Query("INSERT INTO USERS VALUES (:username, :password, :country, :country_code, :role)")
    boolean createNewUser(@Param("username") String username, @Param("password") String password, @Param("country") String country, @Param("country_code") String country_code, @Param("role") String role);
}
