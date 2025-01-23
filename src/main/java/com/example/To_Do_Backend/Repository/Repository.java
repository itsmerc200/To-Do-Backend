package com.example.To_Do_Backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.To_Do_Backend.Entity.ToDo;

public interface  Repository extends JpaRepository<ToDo, Long> {
    
}
