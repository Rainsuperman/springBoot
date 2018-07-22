package com.hand.demo.controller;

import com.hand.demo.entity.Score;
import com.hand.demo.entity.Teacher;
import com.hand.demo.service.ScoreService;
import com.hand.demo.service.TeacherService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @Resource
    private ScoreService scoreService;

    /**
     * 查询所有教师信息
     * @return
     */
    @GetMapping(value = "/teacher")
    public List<Teacher>  queryTeacher(){
         List<Teacher> teachers = teacherService.queryTeacher();
         return  teachers;
    }



    /**
     * 添加一个教师信息
     * @param teacherNumber
     * @param teacherName
     * @param teacherAge
     * @param courseNumber
     * @return
     */
    @PostMapping(value = "/teacher")
    public int  addTeacher(@RequestParam(value = "teacherNumber") String teacherNumber,
                            @RequestParam(value = "teacherName") String teacherName,
                            @RequestParam(value="teacherAge") int teacherAge,
                            @RequestParam(value = "courseNumber") String courseNumber){
        Teacher teacher = new Teacher();
        teacher.setCourseNumber(teacherNumber);
        teacher.setTeacherName(teacherName);
        teacher.setTeacherAge(teacherAge);
        teacher.setCourseNumber(courseNumber);
        return teacherService.insertTeacher(teacher);
    }

    /**
     * 修改一个教师信息
     * @param teacherId
     * @param teacherNumber
     * @param teacherName
     * @param teacherAge
     * @param courseNumber
     * @return
     */
    @PutMapping(value = "/teacher")
    public int updateTeacher(@RequestParam(value = "teacherId") int teacherId,
                              @RequestParam(value = "teacherNumber") String teacherNumber,
                              @RequestParam(value = "teacherName") String teacherName,
                              @RequestParam(value="teacherAge") int teacherAge,
                              @RequestParam(value = "courseNumber") String courseNumber){
        Teacher teacher = new Teacher();
        teacher.setTeacherId(teacherId);
        teacher.setCourseNumber(teacherNumber);
        teacher.setTeacherName(teacherName);
        teacher.setTeacherAge(teacherAge);
        teacher.setCourseNumber(courseNumber);
        return teacherService.updateTeacher(teacher);
    }

    /**
     * 通过Id 来删除一个教师信息
     * @param id
     * @return
     */
    @DeleteMapping(value = "/teacher/{id}")
    public int deleteTeacher(@PathVariable(value = "id") int id){
        return teacherService.deleteTeacher(id);
    }


    /**
     * 教师添加学生分数信息
     * @param courseNumber
     * @param score
     * @param studentNumber
     * @return
     */
    @PostMapping(value = "/score")
    public int addScore(@RequestParam(value = "courseNumber" ) int courseNumber,
                        @RequestParam(value = "score" ) int score,
                        @RequestParam(value = "studentNumber" ) int studentNumber){
        Score score1 = new Score();
        score1.setCourseNumber(courseNumber);
        score1.setScore(score);
        score1.setStudentNumber(studentNumber);
        return scoreService.insertScore(score1);
    }

}
