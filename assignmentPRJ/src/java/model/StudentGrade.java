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
    private Integer gradeItemId;
    private Integer studentId;
    private Date gradeDate;
    private float score;

    public StudentGrade() {
    }

    public StudentGrade(Integer gradeItemId, Integer studentId, Date gradeDate, float score) {
        this.gradeItemId = gradeItemId;
        this.studentId = studentId;
        this.gradeDate = gradeDate;
        this.score = score;
    }

    public Integer getGradeItemId() {
        return gradeItemId;
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

    public void setGradeItemId(Integer gradeItemId) {
        this.gradeItemId = gradeItemId;
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
