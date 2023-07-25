package com.hibernate.many_to_many_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.many_to_many_mapping.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
