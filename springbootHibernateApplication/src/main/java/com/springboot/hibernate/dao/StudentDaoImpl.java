package com.springboot.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.hibernate.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	// Dao Implementation class 
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@Override
	public void saveStudent(Student student) {
		getSession().save(student);

	}

	@Override
	public List<Student> getAllStudentDetails() {
		return getSession().createQuery("from Student", Student.class).list();
	}

	@Override
	public Student getStudentById(long studentId) {

		return getSession().get(Student.class, studentId);
	}

	@Override
	public void deleStudent(long studentId) {
		Student student = getStudentById(studentId);
		getSession().delete(student);
	}

	@Override
	public void updateStudent(long studentId, Student student) {

		Student studentDetails = getStudentById(studentId);
		studentDetails.setStudentName(student.getStudentName());
		studentDetails.setStudentAge(student.getStudentAge());
		studentDetails.setStudentAddress(student.getStudentAddress());
		studentDetails.setLaptops(student.getLaptops());

	}

}
