package com.kabin.SpringJDBCEx;

import com.kabin.SpringJDBCEx.model.Student;
import com.kabin.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
	ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);

		System.out.println("Application is working");

		Student stud = context.getBean(Student.class);
		stud.setRollNo(101);
		stud.setName("Kabin");
		stud.setMarks(95);


		StudentService service = context.getBean(StudentService.class);
		service.addStudent(stud);

		//to print all data from the database

		List<Student> students = service.getStudent();
		System.out.println(students);


	}

}
