package com.placide.TodoApp.services;

import com.placide.TodoApp.models.ToDoModel;
import com.placide.TodoApp.repositories.ToDoAppRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final ToDoAppRepository toDoRepo;
//    creating task
    public ToDoModel createTask(ToDoModel task) {
        return toDoRepo.save(task);
    }
//    get all
    public List<ToDoModel> getAllTask() {
        return toDoRepo.findAll();
    }
}
