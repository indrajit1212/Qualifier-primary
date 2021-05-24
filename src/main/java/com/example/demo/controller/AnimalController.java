package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.qualifier.Animal;

@RestController
@RequestMapping("/Animal")
public class AnimalController {
    @Autowired
	private Animal animal1;
    
    @GetMapping("")
    public String fetchDogCharacteristics()
    {
    	return animal1.characteristics();
    }
	

}
