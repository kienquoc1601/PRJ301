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
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Major;
import model.Student;

/**
 *
 * @author LEGION OS
 */
public class StudentDBContext extends DBContext<Student>{

    @Override
    public ArrayList<Student> list() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            String sql = "SELECT s.student_id\n" +
                                "      ,s.username\n" +
                                "      ,s.major_id\n" +
                                "      ,s.[name]\n" +
                                "      ,s.img_src\n" +
                                "      ,s.gender\n" +
                                "      ,s.dob\n" +
                                "      ,s.roll_number\n" +
                                "	  ,m.major_id\n" +
                                "	  ,m.major_code\n" +
                                "	  ,m.major_name\n" +
                                "  FROM [dbo].[Student] s INNER JOIN Major m\n" +
                                "  ON s.major_id = m.major_id" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                Major m = new Major();
                m.setMajorId(rs.getInt("major_id"));
                m.setMajorCode(rs.getString("major_code"));
                m.setMajorName(rs.getString("major_name"));
                s.setStudentId(rs.getInt("student_id"));
                s.setUsername(rs.getString("username"));
                s.setMajor(m);
                s.setName(rs.getString("name"));
                s.setImgSrc(rs.getString("img_src"));
                s.setGender(rs.getBoolean("gender"));
                s.setDob(rs.getDate("dob"));
                s.setRollNumber(rs.getString("roll_number"));                
                students.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }

    @Override
    public Student get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //update studentCourses for student context
     public Student getByUsername(String username) {
         try {
            String sql = "SELECT s.student_id\n" +
                                "      ,s.username\n" +
                                "      ,s.major_id\n" +
                                "      ,s.[name]\n" +
                                "      ,s.img_src\n" +
                                "      ,s.gender\n" +
                                "      ,s.dob\n" +
                                "      ,s.roll_number\n" +
                                "	  ,m.major_id\n" +
                                "	  ,m.major_code\n" +
                                "	  ,m.major_name\n" +
                                "  FROM [dbo].[Student] s INNER JOIN Major m\n" +
                                "  ON s.major_id = m.major_id\n" +
                                "  WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Major m = new Major();
                m.setMajorId(rs.getInt("major_id"));
                m.setMajorCode(rs.getString("major_code"));
                m.setMajorName(rs.getString("major_name"));
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                s.setUsername(rs.getString("username"));
                s.setMajor(m);
                s.setName(rs.getString("name"));
                s.setImgSrc(rs.getString("img_src"));
                s.setGender(rs.getBoolean("gender"));
                s.setDob(rs.getDate("dob"));
                s.setRollNumber(rs.getString("roll_number"));                
                
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    @Override
    public void insert(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Student model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
