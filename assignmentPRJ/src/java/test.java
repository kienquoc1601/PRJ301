
import dal.GradeDBContext;
import dal.StudentDBContext;
import java.util.ArrayList;
import model.StudentGrade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LEGION OS
 */
public class test {
         
         public static void main(String[] args){
             GradeDBContext g = new GradeDBContext();
             StudentDBContext dbStudent = new StudentDBContext();
             ArrayList<StudentGrade> gl = g.studentCourseGrades(1, 1);
             for(StudentGrade s : gl){
                 
                 System.out.println(s.getGradeItem().getName());
             }
             
         
    
        }
}
