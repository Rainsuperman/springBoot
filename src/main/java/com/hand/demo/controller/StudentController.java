package com.hand.demo.controller;

import com.hand.demo.entity.Course;
import com.hand.demo.entity.Score;
import com.hand.demo.entity.Student;
import com.hand.demo.service.CourseService;
import com.hand.demo.service.ScoreService;
import com.hand.demo.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private ScoreService scoreService;
    @Resource
    private CourseService courseService;

    /**
     * 添加一个学生信息
     * @param studentNumber
     * @param studentName
     * @param studentAge
     * @return
     */
    @PostMapping(value = "/student")
    public int addStudent(@RequestParam(value = "studentNumber") int studentNumber,
                          @RequestParam(value = "studentName") String studentName,
                          @RequestParam(value = "studentAge") int studentAge){
        Student student = new Student();
        student.setStudentNumber(studentNumber);
        student.setStudentName(studentName);
        student.setStudentAge(studentAge);
        return studentService.insertStudent(student);
    }

    /**
     * 修改一个学生信息
     * @param studentId
     * @param studentNumber
     * @param studentName
     * @param studentAge
     * @return
     */
    @PutMapping(value = "/student")
    public int updateStudent(@RequestParam(value = "studentId") int studentId,
                             @RequestParam(value = "studentNumber") int studentNumber,
                             @RequestParam(value = "studentName") String studentName,
                             @RequestParam(value = "studentAge") int studentAge){
        Student student = new Student();
        student.setStudentId(studentId);
        student.setStudentNumber(studentNumber);
        student.setStudentName(studentName);
        student.setStudentAge(studentAge);
        return studentService.updateStudent(student);
    }

    @DeleteMapping(value = "/student/{id}")
    public int deleteStudent(@PathVariable(value = "id") int id){
        return studentService.deleteStudent(id);
    }

    /**
     * 学生查询分数
     * @param studentNumber
     * @return
     */
    @GetMapping(value = "/score/{studentNumber}")
    public Score queryScore(@PathVariable(value = "studentNumber") int studentNumber){
        return scoreService.qureyScoreBySn(studentNumber);
    }

    /**
     * 學生查詢所有課程
     * @return
     */
    @GetMapping(value = "/course")
    public List<Course> queryAllCourses(){
        return courseService.queryAllCourses();
    }

}
