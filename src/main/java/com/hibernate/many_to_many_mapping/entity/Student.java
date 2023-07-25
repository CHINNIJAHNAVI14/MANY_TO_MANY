package com.hibernate.many_to_many_mapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(targetEntity = Courses.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="student-course",
	joinColumns = {
			@JoinColumn(name="Student_id",referencedColumnName = "id")
	},
	inverseJoinColumns = {
			@JoinColumn(name="course_id",referencedColumnName = "id")
	}
	)
	private List<Courses> course;

	public Student() 
	{
		
	}

	public Student(int id, String name,List<Courses> course) 
	{
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}
	
	
	
	

}
