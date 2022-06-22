package com.antara.spring.au.Service;

import com.antara.spring.au.Dao.StudentRepository;
import com.antara.spring.au.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student findStudentById(Integer id) {
        Optional<Student> option= studentRepository.findById(id);
        return option.get();
    }
    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
