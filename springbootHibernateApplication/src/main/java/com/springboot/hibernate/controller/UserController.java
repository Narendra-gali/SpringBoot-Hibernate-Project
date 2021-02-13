package com.springboot.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.entity.Student;
import com.springboot.hibernate.service.StudentService;

@RestController
public class UserController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return ResponseEntity.ok().body("Student saved successfully.");
	}

	@GetMapping("/getAllUsers")
	public List<Student> getAllStudents() {

		return studentService.getAllStudentDetails();
	}

	@GetMapping("/{studentId}")
	public Student getById(@PathVariable long studentId) {
		return studentService.getStudentById(studentId);
	}

	@DeleteMapping("/{studentId}")
	public ResponseEntity<String> deleteUser(@PathVariable long studentId) {
		studentService.deleteStudent(studentId);
		return ResponseEntity.ok().body("Student has been deleted successfully.");
	}

	@PutMapping("/{studentId}")
	public ResponseEntity<?> update(@PathVariable("studentId") long studentId, @RequestBody Student student) {
		studentService.updateStudent(studentId, student);
		return ResponseEntity.ok().body("Student has been updated successfully.");
	}

}
