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
    private GradeItem gradeItem;
    private Integer studentId;
    private Date gradeDate;
    private float score;

    public StudentGrade() {
    }

    public StudentGrade(GradeItem gradeItem, Integer studentId, Date gradeDate, float score) {
        this.gradeItem = gradeItem;
        this.studentId = studentId;
        this.gradeDate = gradeDate;
        this.score = score;
    }

    public GradeItem getGradeItem() {
        return gradeItem;
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

    public void setGradeItem(GradeItem gradeItem) {
        this.gradeItem = gradeItem;
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
