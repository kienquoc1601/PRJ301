/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dal.GradeDBContext;
import dal.StudentDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import model.GradeItem;
import model.Student;
import model.StudentGrade;

/**
 *
 * @author LEGION OS
 */
public class markViewController extends BaseAuthenticationController {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }
    
        StudentDBContext dbStudent = new StudentDBContext();
        GradeDBContext dbGrade = new GradeDBContext();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int cid = Integer.parseInt(request.getParameter("id"));
        ArrayList<Student> students = dbStudent.CourseStudent(cid);
        ArrayList<GradeItem> gradeItems = dbGrade.CourseGrade(cid);
        ArrayList<StudentGrade> studentGrades = dbGrade.CourseStudentGrade(cid);
        request.setAttribute("students", students);
        request.setAttribute("gradeItems", gradeItems);
        request.setAttribute("studentGrades", studentGrades);
        request.getRequestDispatcher("Views/courseMarkView.jsp").forward(request, response);
//        for(Student s : students){
//            response.getWriter().println(s.getStudentId()+"-"+s.getName());
//        }
    }

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] components = request.getParameterValues("component");
        ArrayList<StudentGrade> grades = new ArrayList<>();
        for (String component : components) {
            int studentId = Integer.parseInt(component.split("_")[0]);
            int gradeItemId = Integer.parseInt(component.split("_")[1]);
            StudentGrade sg = new StudentGrade();
            String sid = request.getParameter("sid"+studentId+"_"+gradeItemId);
            if(sid.length()>0)
                sg.setSid(Integer.parseInt(sid));
            else
                sg.setSid(-1);
            String score = request.getParameter("score"+studentId+"_"+gradeItemId);
            if(score.length()>0)
                sg.setScore(Float.parseFloat(score));
            else
                sg.setScore(-1);
            Student s = new Student();
            s.setStudentId(studentId);
            GradeItem g = new GradeItem();
            g.setGradeItemId(gradeItemId);
            sg.setGradeItem(g);
            sg.setStudent(s);
            grades.add(sg);
        }
        dbGrade.saveChanges(grades);
        response.sendRedirect("markView?id=1");
    }

}
