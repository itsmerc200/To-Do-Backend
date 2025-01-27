package com.example.To_Do_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.repositery.Repositery;

@Service
public class TodoService {

    @Autowired
    private Repositery repositery;

    public List<Todo> getAllTodo(){
        return repositery.findAll();
    }
}

