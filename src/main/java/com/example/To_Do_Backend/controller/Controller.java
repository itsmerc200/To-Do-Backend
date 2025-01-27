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
import com.example.To_Do_Backend.repositery.Repositery;

@RestController
@CrossOrigin
public class Controller {

    @Autowired
    Repositery repo;

    @GetMapping("/allList")
    public List<Todo> home() {

        List<Todo> allTodoList = repo.findAll();

        return allTodoList;

    }

    @PostMapping("/newTodo")
    public void CreateTodo(@RequestBody Todo newTodo) {

        repo.save(newTodo);

    }


    @PutMapping("/update/{id}")
    public Todo UpdateTodo(@PathVariable int id,@RequestBody Todo newTodo){
        

       Todo todo = repo.findById(id).get();
       todo.setAddTodo(newTodo.getAddTodo());
        repo.save(todo);
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
}
