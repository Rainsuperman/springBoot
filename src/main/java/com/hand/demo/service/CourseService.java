package com.hand.demo.service;

import com.hand.demo.entity.Course;
import com.hand.demo.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;
    public int insertCourse(Course course){
        return courseMapper.insertCourse(course);
    }
    public int updateCourse(Course course){
        return courseMapper.updateCourse(course);
    }
    public int deleteCourse(int courseId){
        return courseMapper.deleteCourse(courseId);
    }
    public List<Course> queryAllCourses(){
        return courseMapper.queryAllCourses();
    }
}
