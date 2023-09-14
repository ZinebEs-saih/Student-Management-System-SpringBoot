package com.example.gestion_etudiant.Controller;

import com.example.gestion_etudiant.Entity.Student;
import com.example.gestion_etudiant.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    private StudentService studentService;
    //handler ùathod to handle list students and return mode ad view
    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students",studentService.getAllStudent());

        return "students";
    }
    @GetMapping("/students/new")
    public  String createstudentForm(Model model){
        //create student object to hols student form data
        Student student= new Student();
        model.addAttribute("student",student);
        return "create_student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student")Student student){
        studentService.saveStudent(student);
        return "redirect:/students";

    }
    @GetMapping("/students/edit/{id}")
    public  String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student",studentService.getStudentById(id));
        return "edit_student";

    }
    @PostMapping("/students/{id}")
    public  String updateStudent(@PathVariable Long id ,@ModelAttribute("student") Student student,Model model){
       //get student by ID from DB
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        //save Update student object
        studentService.editStudent(existingStudent);
        return "redirect:/students";
    }
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteById(id);
        return "redirect:/students";
    }

}
