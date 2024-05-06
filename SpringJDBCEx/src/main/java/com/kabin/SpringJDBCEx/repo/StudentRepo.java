package com.kabin.SpringJDBCEx.repo;


import com.kabin.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {

        System.out.println("Added in database");

        String sql = "insert into student (rollNo, name, marks) values (?,?,?)";

      int rows =   jdbc.update(sql, student.getRollNo(), student.getName(), student.getMarks());

        System.out.println(rows + " row get effected");
    }

    public List<Student> findAll() {

        String sql = "select * from student";

        RowMapper<Student> mapper = new RowMapper<Student>() {

            public Student mapRow(ResultSet rs, int rowNo) throws SQLException {

                Student s = new Student();
                s.setRollNo(rs.getInt("rollNo"));
                s.setName(rs.getString("name"));
                s.setMarks(rs.getInt("marks"));

                return s;
        }
        };

       return  jdbc.query(sql,mapper);

    }
}
