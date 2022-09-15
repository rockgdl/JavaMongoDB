package com.cliente.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliente.mongo.entity.Student;
import com.cliente.mongo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	
	@Autowired
	StudentService studentService;
	
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	

}
