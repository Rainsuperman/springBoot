package com.hand.demo.mapper;

import com.hand.demo.entity.Course;

import java.util.List;

public interface CourseMapper {
    public int insertCourse(Course course);
    public int updateCourse(Course course);
    public int deleteCourse(int courseId);
    public List<Course> queryAllCourses();
}
