package com.enigma.controller;

import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    Logger logger = Logger.getLogger(StudentController.class.getName());

    @GetMapping("/student/student")
    public String goToStudentForm(){
        logger.log(Level.INFO, "LEWAT TO STUDENT!!!");
        return "/student/student-form";
    }

    @GetMapping("/student/student-list")
    public String goToStudent(){
        logger.log(Level.INFO, "LEWAT ORANG DALEM!!!");
        return "/student/student-list";
    }

    @RequestMapping("/student/student-submit")
    public String doWhatEver(@RequestParam String id, @RequestParam String name, ModelMap model){
        logger.log(Level.INFO, "LEWAT ORANG LUAR");
        logger.log(Level.INFO, id);
        logger.log(Level.INFO, name);

        Student student= new Student();
        student.setId(Integer.parseInt(id));
        student.setName(name);
        studentService.save(student);

//        model.addAttribute("hello", "hai");
        model.addAttribute("kirim", studentService.getStudents());
        return "/student/student-list";
    }
}
