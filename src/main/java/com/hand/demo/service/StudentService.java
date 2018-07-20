package com.hand.demo.service;

import com.hand.demo.entity.Student;
import com.hand.demo.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;
    public int insertStudent(Student student){
        return  studentMapper.insertStudent(student);
    }
    public int updateStudent(Student student){
        return studentMapper.updateStudent(student);
    }
    public int deleteStudent(int studentId){
        return studentMapper.deleteStudent(studentId);
    }
}
