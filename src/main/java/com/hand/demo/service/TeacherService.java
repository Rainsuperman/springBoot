package com.hand.demo.service;

import com.hand.demo.entity.Teacher;
import com.hand.demo.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    public List<Teacher> queryTeacher(){
        List<Teacher> teachers = teacherMapper.queryTeacher();
        return teachers;
    }


    /**
     * 添加一个老师
     *
     * @param teacher
     * @return
     */
    public int insertTeacher(Teacher teacher){
        return teacherMapper.insertTeacher(teacher);
    }

    /**
     * 更新
     *
     * @return
     */
    public int updateTeacher(Teacher teacher){
        return teacherMapper.updateTeacher(teacher);
    }

    /**
     * 通过Id删除
     *
     * @param teacherId
     * @return
     */
    public int deleteTeacher(int teacherId){
        return teacherMapper.deleteTeacher(teacherId);
    }
}