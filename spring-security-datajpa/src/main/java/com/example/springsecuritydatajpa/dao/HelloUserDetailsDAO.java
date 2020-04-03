package com.example.springsecuritydatajpa.dao;

import com.example.springsecuritydatajpa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HelloUserDetailsDAO extends JpaRepository<Users,Integer> {

    Optional<Users> findByUsername(String username);
}
