package com.HenKyubi666.cohantest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.HenKyubi666.cohantest.models.Student;

@Repository
@Transactional
public class StudentDaoImp implements StudentDao{
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void createStudent(Student student) {
		entityManager.merge(student);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents() {
		String query = "FROM Student";
		return (List<Student>) entityManager.createQuery(query).getResultList();
	}

	@Override
	public Student getStudent(int id) {
		return (Student)  entityManager.find(Student.class, id);
	}

	@Override
	public void updateStudent(int id, Student Student) {
		//String query = "FROM Student WHERE Student_id = {id}";
		//Student Student = entityManager.find(Student.class, id);
		//return entityManager.merge(Student);
	}

	@Override
	public void deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}

}

