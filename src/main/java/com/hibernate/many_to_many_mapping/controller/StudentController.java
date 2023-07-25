package com.hibernate.many_to_many_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.many_to_many_mapping.entity.Student;
import com.hibernate.many_to_many_mapping.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public void create(@RequestBody Student student)
	{
		studentService.saveAll(student);
	}
	
	@GetMapping
	public List<Student> getAllUser()
	{
		return studentService.getAll();
	}

}
