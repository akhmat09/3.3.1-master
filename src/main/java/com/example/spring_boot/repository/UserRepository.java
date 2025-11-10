package com.example.spring_boot.repository;

import com.example.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


    List<User> findByName(String name);


    User findByEmail(String email);


    List<User> findByAgeGreaterThan(int age);


    List<User> findByNameContaining(String name);


    List<User> findByNameAndAge(String name, int age);


    List<User> findByOrderByNameAsc();
}