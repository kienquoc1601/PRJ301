/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author LEGION OS
 */
public class Student {
    private Integer studentId;
    private String username;
    private Major major;
    private String name;
    private String imgSrc;
    private boolean gender;
    private Date dob;
    private String rollNumber;
    private ArrayList<Course> courses;
    
    
    public Student() {
    }

    public Student(Integer studentId, String username, Major major, String name, String imgSrc, boolean gender, Date dob, String rollNumber, ArrayList<Course> courses) {
        this.studentId = studentId;
        this.username = username;
        this.major = major;
        this.name = name;
        this.imgSrc = imgSrc;
        this.gender = gender;
        this.dob = dob;
        this.rollNumber = rollNumber;
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }


    public Integer getStudentId() {
        return studentId;
    }

    public String getUsername() {
        return username;
    }

    public Major getMajor() {
        return major;
    }

    public String getName() {
        return name;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public boolean isGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    
    
}
