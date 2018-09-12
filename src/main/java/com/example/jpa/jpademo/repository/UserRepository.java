package com.example.jpa.jpademo.repository;

import com.example.jpa.jpademo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

   // @Query("select user from UserEntity user")
    List<UserEntity> findAll();
}
