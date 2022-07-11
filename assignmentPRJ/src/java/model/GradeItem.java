/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEGION OS
 */
public class GradeItem {
    private Integer gradeItemId;
    private Integer courseId;
    private String name;
    private float weight;

    public GradeItem() {
    }

    public GradeItem(Integer gradeItemId, Integer courseId, String name, float weight) {
        this.gradeItemId = gradeItemId;
        this.courseId = courseId;
        this.name = name;
        this.weight = weight;
    }

    public Integer getGradeItemId() {
        return gradeItemId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setGradeItemId(Integer gradeItemId) {
        this.gradeItemId = gradeItemId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}
