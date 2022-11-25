package com.example.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Test.StudentEntity.StudentEntity;
import com.example.Test.StudentRepository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	private StudentRepository studentrepo;
	@PostMapping("/hai")
	public StudentEntity se(@RequestBody StudentEntity se)
	{
		return studentrepo.save(se);
	}

}
