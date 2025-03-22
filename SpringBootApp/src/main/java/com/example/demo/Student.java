package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student {
	@GetMapping("/wish/{name}")
	public ResponseEntity<String> showDetails(@PathVariable String name)
	{
		return new ResponseEntity<String>("Good Morning,"+name,HttpStatus.OK);
	}

}
