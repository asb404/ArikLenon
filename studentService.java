package com.antara.spring.Service;

import com.antara.spring.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    Student findStudentById(Integer id);
    String UpdateStu(int id, String name, String emailId);
    List<Student> findAllStudent();
}
