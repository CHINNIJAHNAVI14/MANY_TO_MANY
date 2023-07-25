package com.hibernate.many_to_many_mapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Courses 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int duration;
	@ManyToMany(mappedBy = "course", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Student> student;

	public Courses() 
	{

	}

	public Courses(int id, String name, int duration, List<Student> student) 
	{
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.student = student;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public  List<Student> getStudent() {
		return student;
	}

	public void setStudent( List<Student> student) {
		this.student = student;
	}
	
	
	
	

}
