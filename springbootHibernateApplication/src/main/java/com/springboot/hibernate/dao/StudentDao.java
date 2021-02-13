package com.springboot.hibernate.dao;

import java.util.List;

import com.springboot.hibernate.entity.Student;

public interface StudentDao {

	void saveStudent(Student student);

	List<Student> getAllStudentDetails();

	Student getStudentById(long studentId);

	void deleStudent(long studentId);

	void updateStudent(long studentId, Student student);

}
