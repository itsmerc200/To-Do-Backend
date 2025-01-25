package com.example.To_Do_Backend.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.To_Do_Backend.entity.Todo;


public interface  Repositery extends JpaRepository<Todo, Integer>{

}
