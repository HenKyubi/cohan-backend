package com.HenKyubi666.cohantest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.HenKyubi666.cohantest.dao.StudentDao;
import com.HenKyubi666.cohantest.models.Student;

@RestController
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "api/student", method = RequestMethod.POST)
    public void createStudent(@RequestBody Student Student){
        studentDao.createStudent(Student);
    }

    @RequestMapping(value = "api/student", method = RequestMethod.GET)
    public List<Student> getStudents(){
        return studentDao.getStudents();
    }

    @RequestMapping(value = "api/student/{id}" , method = RequestMethod.GET)
    public Student getStudent(@PathVariable int id){
        return studentDao.getStudent(id);
    }

    @RequestMapping(value = "api/student", method = RequestMethod.PATCH)
    public void updateStudent(@RequestBody int id, Student Student){
        studentDao.updateStudent(id, Student);
    }

    @RequestMapping(value = "api/student/{id}" , method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id){
        studentDao.deleteStudent(id);
    }
}
