package com.api.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.todolist.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
