package com.hibernate.many_to_many_mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernate.many_to_many_mapping.entity.Student;
import com.hibernate.many_to_many_mapping.repository.StudentRepository;
@Service
public class StudentService
{
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAll()
	{
		List<Student> student = new ArrayList<>();
		studentRepository.findAll().forEach(student::add);
		return student;
	}	 
	
	public void saveAll(Student student)
	{
		studentRepository.save(student);
	}

}
