/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author LEGION OS
 */
public class StudentGrade {
    private Integer sid;
    private GradeItem gradeItem;
     private Student student;
    private Integer studentId;
    private Date gradeDate;
    private float score;

    public StudentGrade() {
    }

    public StudentGrade(Integer sid, GradeItem gradeItem, Student student, Integer studentId, Date gradeDate, float score) {
        this.sid = sid;
        this.gradeItem = gradeItem;
        this.student = student;
        this.studentId = studentId;
        this.gradeDate = gradeDate;
        this.score = score;
    }

    public Integer getSid() {
        return sid;
    }

    public GradeItem getGradeItem() {
        return gradeItem;
    }

    public Student getStudent() {
        return student;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Date getGradeDate() {
        return gradeDate;
    }

    public float getScore() {
        return score;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setGradeItem(GradeItem gradeItem) {
        this.gradeItem = gradeItem;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setGradeDate(Date gradeDate) {
        this.gradeDate = gradeDate;
    }

    public void setScore(float score) {
        this.score = score;
    }

    
}
