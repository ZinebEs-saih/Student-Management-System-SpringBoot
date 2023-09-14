package com.example.gestion_etudiant.Respository;

import com.example.gestion_etudiant.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student,Long> {

}
