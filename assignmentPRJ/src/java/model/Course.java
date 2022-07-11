/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEGION OS
 */
public class Course {
    private Integer courseId;
    private Integer teacherId;
    private Integer subjectId;
    private String name;
    private String semester;

    public Course() {
    }

    public Course(Integer courseId, Integer teacherId, Integer subjectId, String name, String semester) {
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.name = name;
        this.semester = semester;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public String getName() {
        return name;
    }

    public String getSemester() {
        return semester;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
}
