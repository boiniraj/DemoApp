package com.dc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.dto.EmployeeDto;
import com.dc.entity.EmployeeEntity;
import com.dc.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmployeeRest {
	@Autowired
	private EmpService service;
	
	@GetMapping("/")
    public String homePage() {
        return "index";  // Looks for index.html in src/main/resources/templates/
    }
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody EmployeeDto emp)
	{
		 String str=service.registeremp(emp);
		return new ResponseEntity<String>(str, HttpStatus.CREATED);
	}
	@GetMapping("/showdata")
	public ResponseEntity<List<EmployeeEntity>> showData()
	{
		List<EmployeeEntity> emp=service.showAlldata();
		return new ResponseEntity<List<EmployeeEntity>>(emp,HttpStatus.ACCEPTED);
	}

}
