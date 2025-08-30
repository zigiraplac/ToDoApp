package com.placide.TodoApp.controllers;

import com.placide.TodoApp.models.ToDoModel;
import com.placide.TodoApp.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tasks")
@RequiredArgsConstructor
public class ToDoController {
    private final TodoService todoService;
    @PostMapping
    public ToDoModel saveToDo(@RequestBody ToDoModel task) {
        return todoService.createTask(task);
    }

    @GetMapping
    public ResponseEntity<List<ToDoModel>> getAllTasks(){
        return ResponseEntity.ok(todoService.getAllTask());
    }

    @GetMapping("byId")
    public ResponseEntity<ToDoModel> getTaskById(@RequestParam int id){
        return ResponseEntity.ok(todoService.getTaskById(id));
    }
    @PutMapping
    public ResponseEntity<ToDoModel> updateTask(@RequestBody ToDoModel task){
        return ResponseEntity.ok(todoService.updateTask(task));
    }
    @DeleteMapping
    public ResponseEntity<String> deleteTask(@RequestParam int id){
        return ResponseEntity.ok(todoService.deleteTaskById(id));
    }
}
