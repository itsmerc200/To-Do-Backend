package com.example.To_Do_Backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class Controller {

    @GetMapping("/home")    
    public String home() {
		System.out.println("THis is Home");
		return "homeee";
		
	}



}
