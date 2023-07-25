package com.hibernate.many_to_many_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.many_to_many_mapping.entity.Courses;
import com.hibernate.many_to_many_mapping.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Courses> getAll()
	{
		List<Courses> course = new ArrayList<>();
		courseRepository.findAll().forEach(course::add);
		return course;
	}	 
	
	public void save(Courses course)
	{
		courseRepository.save(course);
	}
	
	

}
