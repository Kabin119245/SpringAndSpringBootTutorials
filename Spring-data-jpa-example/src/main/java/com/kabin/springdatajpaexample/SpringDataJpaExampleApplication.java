package com.kabin.springdatajpaexample;

import com.kabin.springdatajpaexample.model.Student;
import com.kabin.springdatajpaexample.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExampleApplication {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(SpringDataJpaExampleApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

        s1.setRollNo(101);
        s1.setName("Kabin");
        s1.setMarks(85);

        s2.setRollNo(102);
        s2.setName("Kabina");
        s2.setMarks(84);




       // repo.save(s3);

     //to print all
     System.out.println(repo.findAll());


     //to fetch one row
     System.out.println(repo.findById(103));


     System.out.println(repo.findByName("Kabin"));

     System.out.println(repo.findByMarks(85));


     System.out.println(repo.findByMarksIsGreaterThan(82));



     //Update and Delete

     s3.setRollNo(103);
     s3.setName("Kanchan");
     s3.setMarks(75);

     //repo.save(s3);

     repo.delete(s2);

    }

}
