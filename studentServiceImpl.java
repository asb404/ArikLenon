package com.antara.spring.Service;

import com.antara.spring.Dao.StudentRepository;
import com.antara.spring.Entity.Student;
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
	public String UpdateStu(int id, String name, String emailId) {
		Optional<Student> stu=repo.findById(id);
		if (stu.isPresent()){
			student updatedstu=stu.get();
			updatedemp.setStuEmail(emailId);
			updatedemp.setStuName(name);
			repo.save(updatedstu);
			return "Student updated Successfully";
		}
		else {
			return "No such student present";
		}
		// TODO Auto-generated method stub
		
	}
    
    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
