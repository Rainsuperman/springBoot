package com.hand.demo.mapper;

import com.hand.demo.entity.Teacher;

import java.util.List;

public interface TeacherMapper {
    /**
     * 查询所有老师信息
     * @return
     */
    public List<Teacher> queryTeacher();

    /**
     * 添加一个老师
     * @param teacher
     * @return
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 更新
     * @return
     */
    public int updateTeacher(Teacher teacher);

    /**
     * 通过Id删除
     * @param teacherId
     * @return
     */
    public int deleteTeacher(int teacherId);
}
