package com.example.gestion_etudiant.Service.impl;

import com.example.gestion_etudiant.Entity.Student;
import com.example.gestion_etudiant.Respository.StudentRespository;
import com.example.gestion_etudiant.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService  {


    private StudentRespository studentRespository;

    public StudentServiceimpl(StudentRespository studentRespository) {
        super();
        this.studentRespository = studentRespository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRespository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRespository.save(student);
    }




    @Override
    public Student editStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
       return  studentRespository.findById(id).get();
        //return null;
    }

    @Override
    public void deleteById(Long id) {
        studentRespository.deleteById(id);
    }

}
