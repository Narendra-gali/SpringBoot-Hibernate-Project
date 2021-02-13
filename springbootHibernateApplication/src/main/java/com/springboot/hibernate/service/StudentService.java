package com.springboot.hibernate.service;

import java.util.List;

import com.springboot.hibernate.entity.Student;

public interface StudentService {

	void saveStudent(Student student);

	List<Student> getAllStudentDetails();

	Student getStudentById(long studentId);

	void deleteStudent(long studentId);

	void updateStudent(long studentId, Student student);

}
