package com.hand.demo.mapper;

import com.hand.demo.entity.Student;


public interface StudentMapper {
    public int insertStudent(Student student);
    public int updateStudent(Student student);
    public int deleteStudent(int studentId);
}
