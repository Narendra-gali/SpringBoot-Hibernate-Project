package com.springboot.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hibernate.dao.StudentDao;
import com.springboot.hibernate.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	@Override
	public List<Student> getAllStudentDetails() {
		return studentDao.getAllStudentDetails();
	}

	@Override
	public Student getStudentById(long studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public void deleteStudent(long studentId) {
		 studentDao.deleStudent(studentId);
	}

	@Override
	public void updateStudent(long studentId, Student student) {
		studentDao.updateStudent(studentId,student);
		
	}

}
