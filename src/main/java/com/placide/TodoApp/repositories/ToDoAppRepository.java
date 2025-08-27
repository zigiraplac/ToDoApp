package com.placide.TodoApp.repositories;

import com.placide.TodoApp.models.ToDoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoAppRepository extends JpaRepository<ToDoModel, Integer> {
}
