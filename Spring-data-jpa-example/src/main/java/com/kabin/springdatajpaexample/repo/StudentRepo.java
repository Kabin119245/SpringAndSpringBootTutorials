package com.kabin.springdatajpaexample.repo;

import com.kabin.springdatajpaexample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {



    @Query("select  s from Student s where s.name = ?1")
 //   if i comment above statement it will still work, (DSL)
    List<Student> findByName(String name);
    List<Student> findByMarks(int marks);

    //method name should start with findBy(Variablename)

    //marks greater then 80
    List<Student> findByMarksIsGreaterThan(int marks);












}
