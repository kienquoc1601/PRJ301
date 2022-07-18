/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Major;
import model.Student;
import model.Teacher;

/**
 *
 * @author LEGION OS
 */
public class TeacherDBContext extends DBContext<Teacher>{

    @Override
    public ArrayList<Teacher> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Teacher getByUsername(String username) {
         try {
            String sql = "SELECT [teacher_id]\n" +
                            "      ,[username]\n" +
                            "      ,[name]\n" +
                            "      ,[img_src]\n" +
                            "      ,[email]\n" +
                            "  FROM [dbo].[Teacher]"
                        + "WHERE username = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {              
                Teacher t = new Teacher();
                t.setUserName(rs.getString("username"));
                t.setTeacherId(rs.getInt("teacher_id"));
                t.setName(rs.getString("name"));
                t.setEmail(rs.getString("email"));
                t.setImg_src(rs.getString("img_src"));                       
                return t;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public Teacher get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(Teacher model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Teacher model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Teacher model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
