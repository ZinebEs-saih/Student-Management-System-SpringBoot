package com.example.gestion_etudiant.Service;

import com.example.gestion_etudiant.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllStudent();
    Student saveStudent(Student student);
    Student editStudent(Student student);
    Student getStudentById(Long id);
    void deleteById(Long id);
}
