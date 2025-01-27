package com.example.To_Do_Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.repositery.Repositery;

import com.example.To_Do_Backend.entity.Todo;
import com.example.To_Do_Backend.repositery.Repositery;

@Service
public class TodoService {

    @Autowired
 nitin-backend-dev
    private Repositery repositery;

    public List<Todo> getAllTodo(){
        return repositery.findAll();
    }


