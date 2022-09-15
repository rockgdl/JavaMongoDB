package com.cliente.mongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliente.mongo.entity.Student;
import com.cliente.mongo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) {
		
		return studentRepository.save(student);
	}

}
