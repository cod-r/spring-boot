package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.HomeRepository;

import java.io.File;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class HomeController {

    @Autowired
    HomeRepository homeRepository;

    @GetMapping("/")
    public String helloWorld() {
        return homeRepository.getReferenceById(1L).getMessage();
    }
}
