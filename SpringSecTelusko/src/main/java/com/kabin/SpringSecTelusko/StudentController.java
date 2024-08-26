package com.kabin.SpringSecTelusko;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
public class StudentController {

//    Hard Coded Values
    private List<Student> students = new ArrayList<Student>(List.of(
            new Student(1,"Kabin",80),
            new Student(2,"John",75),
            new Student(3,"Jane",90),
            new Student(4,"Peter",65),
            new Student(5,"Sarah",85)
                    )
    );

    @GetMapping("/students")
    public List<Student> getStudentList() {
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }


    @PostMapping("/students")
//    @Request body -> Spring automatically deserializes the JSON into a Java type
    public Student addStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }

}
