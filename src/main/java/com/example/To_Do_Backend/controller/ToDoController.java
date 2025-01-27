package com.example.To_Do_Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.service.TodoService;

@RestController
@CrossOrigin
@RequestMapping("/toDo")
public class ToDoController {

    @Autowired
    private TodoService todoService;
    
    @GetMapping("/allToDo")
    public List<Todo> GetAllTodo(){
        List<Todo> listOfToDo=todoService.getAllTodo();
        return listOfToDo;
    }
}
