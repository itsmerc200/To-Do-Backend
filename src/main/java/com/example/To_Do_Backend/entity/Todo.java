package com.example.To_Do_Backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate primary key
    private int id;

    @Column
    private String addTodo;

    public Todo() {

    }

    public Todo(String addTodo) {
        this.addTodo = addTodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddTodo() {
        return addTodo;
    }

    public void setAddTodo(String addTodo) {
        this.addTodo = addTodo;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id + ", addTodo=" + addTodo + "]";
    }

}
