package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.food.entities.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
