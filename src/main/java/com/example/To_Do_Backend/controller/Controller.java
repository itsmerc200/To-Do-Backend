package com.example.To_Do_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.service.TodoService;

@RestController
@CrossOrigin
public class Controller {

    @Autowired
    private TodoService todoService;

    @GetMapping("/allList")
    public List<Todo> allTodoList() {

        return todoService.allTodoList();

    }

    @PostMapping("/newTodo")
    public void createTodo(@RequestBody Todo newTodo) {
        // Delegate the logic to the service layer
        todoService.createTodo(newTodo);
    }
@PutMapping("/update/{id}")
public Todo UpdateTodo(@PathVariable int id, @RequestBody Todo newTodo) {
    // Fetch the Todo item by ID
    Todo todo = repo.findById(id).get();

    // Update the Todo content
    todo.setAddTodo(newTodo.getAddTodo());
    repo.save(todo);

    // Return the updated Todo
    return todo;
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteTodo(@PathVariable int id) {
    // Check if the entity exists
    Todo todo = repo.findById(id)
                    .orElseThrow(() -> new RuntimeException("Todo not found with id: " + id));

    // Delete the entity
    repo.delete(todo);

    // Return a success response
    return ResponseEntity.ok("Todo deleted successfully with id: " + id);
}

