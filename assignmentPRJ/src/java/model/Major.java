/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEGION OS
 */
public class Major {
    private Integer majorId;
    private String majorName;
    private String majorCode;

    public Major() {
    }

    public Major(Integer majorId, String majorName, String majorCode) {
        this.majorId = majorId;
        this.majorName = majorName;
        this.majorCode = majorCode;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public void setMajorCode(String majorCode) {
        this.majorCode = majorCode;
    }
    
    
}
