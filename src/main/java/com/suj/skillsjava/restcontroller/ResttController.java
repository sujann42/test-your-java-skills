package com.suj.skillsjava.restcontroller;


import com.suj.skillsjava.beans.StudentBeans;
import com.suj.skillsjava.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResttController {

    @Autowired
    private RestService resttService;

    //Getting all students
    @RequestMapping("/getAllStudents")
    public List<StudentBeans> getAll() {

        return resttService.getAllStudents();
    }

    //Getting one student only
    @RequestMapping("/students/{id}")
    public StudentBeans getStudent(@PathVariable int id) {
        return resttService.getStudentById(id);
    }

    //Post Student
    @PostMapping("/students")
    public void addStudent(@RequestBody StudentBeans studentBeans) {
        resttService.addStudent(studentBeans);
    }

    //Put Student
    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody StudentBeans studentBeans, @PathVariable int id) {
        resttService.updateStudent(id, studentBeans);
    }

    //Delete Student
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        resttService.deleteStudent(id);
    }

}
