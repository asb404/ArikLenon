package com.antara.spring.au.Service;

import com.antara.spring.au.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    Student findStudentById(Integer id);

    List<Student> findAllStudent();
}
