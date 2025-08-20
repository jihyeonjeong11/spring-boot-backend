package com.example.practice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
@RestController
@RequestMapping("/")
public class PracticeController {

    @GetMapping("/greeting")
	public ResponseEntity<String> test(){
        return ResponseEntity.ok("Hello, World");
    }

}
