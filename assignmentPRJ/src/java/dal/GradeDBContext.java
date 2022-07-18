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
import model.Student;
import model.StudentGrade;

/**
 *
 * @author LEGION OS
 */
public class GradeDBContext extends DBContext<StudentGrade>{

    public ArrayList<StudentGrade>studentCourseGrades(int sid , int cid){
        ArrayList<StudentGrade> grades = new ArrayList<StudentGrade>();
        try{
        String sql = "SELECT A.grade_item_id,A.grade_date,G.name,G.weight,A.score FROM\n" +
                "                    (SELECT * FROM StudentGrade) A\n" +
                "                    INNER JOIN\n" +
                "                    (SELECT student_id,grade_item_id,MAX(grade_date) as grade_date FROM StudentGrade GROUP BY student_id,grade_item_id) B\n" +
                "                    ON A.grade_item_id = B.grade_item_id AND A.student_id = B.student_id AND A.grade_date = B.grade_date\n" +
                "					JOIN [dbo].[GradeItem] as G\n" +
                "					ON A.grade_item_id= G.grade_item_id\n" +
                "					WHERE A.student_id = ? AND G.course_id = ?\n" +
                "					ORDER BY G.weight";
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
                  grades.add(s);
            }
            }catch(SQLException ex){
                    Logger.getLogger(CourseDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        return grades;
    }
    
    
    @Override
    public ArrayList<StudentGrade> list() {
       ArrayList<StudentGrade> grades = new ArrayList<>();
        try {
            String sql = "SELECT A.* FROM\n" +
"                    (SELECT * FROM StudentGrade) A\n" +
"                    INNER JOIN\n" +
"                    (SELECT student_id,grade_item_id,MAX(grade_date) as grade_date FROM StudentGrade GROUP BY student_id,grade_item_id) B\n" +
"                    ON A.grade_item_id = B.grade_item_id AND A.student_id = B.student_id AND A.grade_date = B.grade_date";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                StudentGrade sg = new StudentGrade();
                sg.setSid(rs.getInt("sid"));
                sg.setScore(rs.getFloat("score"));
                sg.setGradeDate(rs.getDate("grade_date"));
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                sg.setStudent(s);
                GradeItem g = new GradeItem();
                g.setGradeItemId(rs.getInt("grade_item_id"));
                sg.setGradeItem(g);
                grades.add(sg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }
    public ArrayList<GradeItem> CourseGrade(int course_id){
        ArrayList<GradeItem> grades = new ArrayList<>();
        try {
            String sql = "SELECT [grade_item_id]\n" +
                            "      ,[course_id]\n" +
                            "      ,[name]\n" +
                            "      ,[weight]\n" +
                            "  FROM [dbo].[GradeItem]\n" +
                            "  WHERE course_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, course_id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                GradeItem g = new GradeItem();
                g.setCourseId(rs.getInt("course_id"));
                g.setGradeItemId(rs.getInt("grade_item_id"));
                g.setName(rs.getString("name"));
                g.setWeight(rs.getFloat("weight"));
                grades.add(g);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
        
    }
    public ArrayList<StudentGrade> CourseStudentGrade(int course_id) {
       ArrayList<StudentGrade> grades = new ArrayList<>();
        try {
            String sql = "SELECT [sid]\n" +
                            "      ,s.[grade_item_id]\n" +
                            "      ,[student_id]\n" +
                            "      ,[grade_date]\n" +
                            "      ,[score]\n" +
                            "  FROM [dbo].[StudentGrade] as s\n" +
                            "  JOIN dbo.GradeItem as g\n" +
                            "  ON s.grade_item_id = g.grade_item_id\n" +
                            "  WHERE course_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, course_id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                StudentGrade sg = new StudentGrade();
                sg.setSid(rs.getInt("sid"));
                sg.setScore(rs.getFloat("score"));
                sg.setGradeDate(rs.getDate("grade_date"));
                Student s = new Student();
                s.setStudentId(rs.getInt("student_id"));
                sg.setStudent(s);
                GradeItem g = new GradeItem();
                g.setGradeItemId(rs.getInt("grade_item_id"));
                sg.setGradeItem(g);
                grades.add(sg);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grades;
    }
    public void saveChanges(ArrayList<StudentGrade> grades) {
        try {
            connection.setAutoCommit(false);
            for (StudentGrade exam : grades) {
                //INSERT
                if (exam.getSid() == -1 && exam.getScore() != -1) {
                    String sql_insert = "INSERT INTO [dbo].[StudentGrade]\n"
                            + "           ([grade_item_id]\n"
                            + "           ,[student_id]\n"
                            + "           ,[grade_date]\n"
                            + "           ,[score])\n"
                            + "     VALUES\n"
                            + "           (?\n"
                            + "           ,?\n"
                            + "	       ,GETDATE()\n"
                            + "	       ,?)";
                    PreparedStatement stm = connection.prepareStatement(sql_insert);
                    stm.setInt(1, exam.getGradeItem().getGradeItemId());
                    stm.setInt(2, exam.getStudent().getStudentId());
                    stm.setFloat(3, exam.getScore());
                    stm.executeUpdate();
                } //UPDATE
                else if (exam.getSid() != -1 && exam.getScore() != -1) {
                    String sql_update = "UPDATE StudentGrade SET Score = ? WHERE sid = ?";
                    PreparedStatement stm = connection.prepareStatement(sql_update);
                    stm.setFloat(1, exam.getScore());
                    stm.setInt(2, exam.getSid());
                    stm.executeUpdate();
                } //DELETE
                else if (exam.getSid() != -1 && exam.getScore() == -1) {
                    String sql_delete = "DELETE StudentGrade WHERE sid = ?";
                    PreparedStatement stm = connection.prepareStatement(sql_delete);
                    stm.setInt(1, exam.getSid());
                    stm.executeUpdate();
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(GradeDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
