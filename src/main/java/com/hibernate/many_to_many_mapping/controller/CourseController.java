package com.hibernate.many_to_many_mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.many_to_many_mapping.entity.Courses;
import com.hibernate.many_to_many_mapping.service.CourseService;
@RestController
@RequestMapping("/api/course")
public class CourseController
{
	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public void create(@RequestBody Courses course)
	{
		courseService.save(course);
	}
	
	@GetMapping
	public List<Courses> getAllUser()
	{
		return courseService.getAll();
	}

}
