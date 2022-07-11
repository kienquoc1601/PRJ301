/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEGION OS
 */
public class Teacher {
    private Integer teacherId;
    private String userName;
    private String name;
    private String img_src;
    private String email;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String userName, String name, String img_src, String email) {
        this.teacherId = teacherId;
        this.userName = userName;
        this.name = name;
        this.img_src = img_src;
        this.email = email;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getImg_src() {
        return img_src;
    }

    public String getEmail() {
        return email;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
