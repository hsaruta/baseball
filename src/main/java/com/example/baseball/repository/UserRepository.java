package com.example.baseball.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.baseball.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
}
