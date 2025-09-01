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
//    GET BY {ID}
public ToDoModel getTaskById(int id) {
    return toDoRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
}
//    UPDATE A TASK BY ID
    public ToDoModel updateTask(ToDoModel task) {
        if (toDoRepo.existsById(task.getId())) {
            return toDoRepo.save(task);
        }
        return null;
    }
//    DELETE BY ID
    public String deleteTaskById(int id) {
        if (toDoRepo.existsById(id)) {
            toDoRepo.deleteById(id);
            return "Deleted";
        }
        return null;
    }
}
