package com.example.gestion_etudiant;

import com.example.gestion_etudiant.Entity.Student;
import com.example.gestion_etudiant.Respository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionEtudiantApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GestionEtudiantApplication.class, args);
    }
    @Autowired
    private StudentRespository studentRespository;
    @Override
    public void run(String... args) throws Exception {
        /*Student student = new Student("KHADIJA","ES-SAIH","khadija@gmail.com");
        studentRespository.save(student);
        Student student2 = new Student("Maryam","EKHAMMALI","MARYAM@gmail.com");
        studentRespository.save(student2);
        */
    }
}
