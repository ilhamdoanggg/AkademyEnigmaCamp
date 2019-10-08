package com.enigma.controller;

import com.enigma.entity.Student;
import com.enigma.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/student")
    public ModelAndView toStudentView() {
        return new ModelAndView("student-form",
                "student", new Student());
    }

    @PostMapping("/student")
    public String toStudentForm(
            @ModelAttribute("student") Student student, Model model) {

        studentRepository.save(student);
        List<Student> students = studentRepository.findAll();

        model.addAttribute("x", student);
        model.addAttribute("studentlist", students);
        return "student-view";
    }
}
/*
    @GetMapping("/student")
    public String toStudentView(Model model){
        return "student-form";
    }

    @PostMapping("/student")
    public String toStudentForm(@RequestParam Integer id, @RequestParam String name, Model model){
        Student student = new Student(id, name);
        model.addAttribute("x", student);
        return "student-view";
    }*/


    /*@GetMapping("/student")
    public String toStudent(Model model){
        model.addAttribute("message", "angga");
        return "/student/student-view.html";
    }

    @GetMapping("/student-form")
    public String goToForm(){
        return "/student/student-form.html";
    }

}*/
