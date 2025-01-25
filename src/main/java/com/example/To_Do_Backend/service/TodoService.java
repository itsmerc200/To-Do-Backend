package com.example.To_Do_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.repositery.Repositery;

@Service
public class TodoService {

    @Autowired
    private Repositery repo;

    public List<Todo> allTodoList() {
        return repo.findAll(); // Fetch all todos from the database
    }

    public void createTodo(Todo newTodo) {
        // Save the new Todo to the repository
        repo.save(newTodo);
    }

    public Todo UpdateTodo(@PathVariable int id) {

        Todo todo = repo.findById(id).get();
        todo.setAddTodo("good morning");
        return repo.save(todo);

    }  

    public void deleteTodo(@PathVariable int id) {

        Todo todo = repo.findById(id).get();
        repo.delete(todo);
    }

}


