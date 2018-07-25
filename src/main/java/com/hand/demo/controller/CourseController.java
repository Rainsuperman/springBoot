package com.hand.demo.controller;

import com.hand.demo.entity.Course;
import com.hand.demo.entity.Student;
import com.hand.demo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    /**
     * 查询所有课程
     * @return
     */
    @GetMapping(value = "/course")
    public List<Course> queryAllCourses(){
        return courseService.queryAllCourses();
    }

    /**
     * 添加一个课程信息
     * @param courseId
     * @param courseNumber
     * @param courseName
     * @return
     */
    @PostMapping(value = "/course")
    public int addCourse(@RequestParam(value = "courseId") int courseId,
                          @RequestParam(value = "courseNumber") int courseNumber,
                          @RequestParam(value = "courseName") String courseName){
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseNumber(courseNumber);
        course.setCourseName(courseName);
        return courseService.insertCourse(course);
    }

    /**
     * 修改一个课程信息
     * @param courseId
     * @param courseNumber
     * @param courseName
     * @return
     */
    @PutMapping(value = "/course")
    public int updateCourse(@RequestParam(value = "courseId") int courseId,
                         @RequestParam(value = "courseNumber") int courseNumber,
                         @RequestParam(value = "courseName") String courseName){
        Course course = new Course();
        course.setCourseId(courseId);
        course.setCourseNumber(courseNumber);
        course.setCourseName(courseName);
        return courseService.updateCourse(course);
    }

    /**
     * 通过课程的Id来删除一个课程信息
     * @param id
     * @return
     */
    @DeleteMapping(value = "/student/{id}")
    public int deleteStudent(@PathVariable(value = "id") int id){
        return courseService.deleteCourse(id);
    }

    public void print(){
        System.out.println("flsjadk");
    }
}

