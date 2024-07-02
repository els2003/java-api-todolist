package com.api.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.todolist.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
