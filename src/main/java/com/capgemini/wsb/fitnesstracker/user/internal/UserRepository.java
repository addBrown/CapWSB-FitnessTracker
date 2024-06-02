package com.capgemini.wsb.fitnesstracker.user.internal;

import com.capgemini.wsb.fitnesstracker.user.api.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Query searching users by email address. It matches by exact match.
     *
     * @param email email of the user to search
     * @return {@link Optional} containing found user or {@link Optional#empty()} if none matched
     */



    /**
     * Query searching users by email address. It matches by exact match.
     *
     * @param email email of the user to search
     */

    @Query("SELECT u FROM User u WHERE LOWER(u.email) LIKE CONCAT('%', LOWER(:email), '%')")
    Optional<User> findByEmail(String email);

    /**
     * Query searching users by age above that defined.
     * It calculates difference between CURRENT_DATE and `birthdate` from UserEntity
     *
     * @param age age of the user to search
     */

    @Query("SELECT u FROM User u WHERE FUNCTION('timestampdiff', YEAR, u.birthdate, CURRENT_DATE) > :age")
    List<User> findByAgeGreaterThan(@Param("age") int age);



}