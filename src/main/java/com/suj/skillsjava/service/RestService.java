package com.suj.skillsjava.service;

import com.suj.skillsjava.beans.StudentBeans;
import com.suj.skillsjava.entity.StudentsEntity;
import com.suj.skillsjava.repos.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestService {

    @Autowired
    private MainRepository mainRepository;

    public List<StudentBeans> getAllStudents() {
        List<StudentBeans> students = new ArrayList<>();
        mainRepository.findAll().forEach(students::add);
        return students;
    }

    public StudentBeans getStudentById(int id) {
        Optional<StudentBeans> optional = Optional.of(mainRepository.findById(id).orElse(new StudentBeans()));
        return optional.get();
    }

    public void addStudent(StudentBeans studentBeans) {
        mainRepository.save(studentBeans);
    }

    public void updateStudent(int id, StudentBeans studentBeans) {
        mainRepository.save(studentBeans);
    }

    public void deleteStudent(int id) {
        mainRepository.delete(getStudentById(id));
    }
}
