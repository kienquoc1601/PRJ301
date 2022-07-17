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
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Course;
import model.GradeItem;
import model.StudentGrade;

/**
 *
 * @author LEGION OS
 */
public class GradeDBContext extends DBContext<StudentGrade>{

    
    public ArrayList<StudentGrade> studentCourseGradeList(int sid , int cid){
        HashMap<Integer,StudentGrade> map = new HashMap<Integer,StudentGrade>();
        
        try {
            String sql = "SELECT s.grade_item_id,s.grade_date,g.name,g.weight,s.score\n" +
                                "  FROM [dbo].[StudentGrade] as s\n" +
                                "  JOIN [dbo].[GradeItem] as g\n" +
                                "	ON s.grade_item_id= g.grade_item_id\n" +
                                "	WHERE s.student_id = ? AND g.course_id = ?\n" +
                                "	ORDER BY g.weight";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1,sid);
            stm.setInt(2,cid);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                  GradeItem g = new GradeItem();
                  StudentGrade s = new StudentGrade();
                  g.setCourseId(cid);
                  g.setName(rs.getString("name"));
                  g.setWeight(rs.getFloat("weight"));
                  g.setGradeItemId(rs.getInt("grade_item_id"));
                  s.setStudentId(sid);
                  s.setGradeItem(g);
                  s.setScore(rs.getFloat("score"));
                  s.setGradeDate(rs.getDate("grade_date"));
                  map.put(g.getGradeItemId(), s);
//                    if(map.keySet().contains(g.getGradeItemId())){
//                        if(s.getGradeDate().compareTo(map.get(g.getGradeItemId()).getGradeDate()) >=0){
//                            map.put(g.getGradeItemId(), s);
//                        }else{
//                            map.put(g.getGradeItemId(), s);
//                        }
//                    }  
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<StudentGrade> grades = new ArrayList<StudentGrade>(map.values());
        return grades;
        
    }
    @Override
    public ArrayList<StudentGrade> list() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public StudentGrade get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(StudentGrade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(StudentGrade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(StudentGrade model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
