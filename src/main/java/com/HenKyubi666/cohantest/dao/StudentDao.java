package com.HenKyubi666.cohantest.dao;

import java.util.List;

import com.HenKyubi666.cohantest.models.Student;

public interface StudentDao {

  void createStudent(Student student);
  List<Student> getStudents();
  Student getStudent(int id);
  void updateStudent(int id, Student student);
  void deleteStudent(int id);
  
}
