/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Student;

/**
 *
 * @author LEGION OS
 */
public class CourseDBContext extends DBContext<Course> {

    @Override
    public ArrayList<Course> list() {
       ArrayList<Course> courses = new ArrayList<>();
        try {
            String sql = "SELECT [course_id]\n" +
                                "      ,[teacher_id]\n" +
                                "      ,[subject_id]\n" +
                                "      ,[name]\n" +
                                "      ,[semester]\n" +
                                "  FROM [dbo].[Course]";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Course c = new Course();
                c.setCourseId(rs.getInt("course_id"));
                c.setTeacherId(rs.getInt("teacher_id"));
                c.setSubjectId(rs.getInt("subject_id"));
                c.setName(rs.getString("name"));
                c.setSemester(rs.getString("semester"));
                courses.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }

    @Override
    public Course get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public ArrayList<Course> studentCourses(int id){
        ArrayList<Course> courses = new ArrayList<Course>();
        
        try{
            String sql = "SELECT c.course_id\n" +
                                "      ,teacher_id\n" +
                                "      ,subject_id\n" +
                                "      ,c.name\n" +
                                "      ,semester" +
                                "  FROM [dbo].[StudentGrade] as t\n" +
                                "  JOIN [dbo].[GradeItem] as i\n" +
                                "	ON t.grade_item_id= i.grade_item_id\n" +
                                "  JOIN dbo.course as c\n" +
                                "	ON i.course_id = c.course_id\n" +
                                "	WHERE t.student_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1,id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                    Course c = new Course();
                    c.setCourseId(rs.getInt("course_id"));
                    c.setTeacherId(rs.getInt("teacher_id"));
                    c.setSubjectId(rs.getInt("subject_id"));
                    c.setName(rs.getString("name"));
                    c.setSemester(rs.getString("semester"));
                    courses.add(c);
            }
            
            
        }catch (SQLException ex){
            Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courses;
    }
    

    @Override
    public void insert(Course model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Course model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Course model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}