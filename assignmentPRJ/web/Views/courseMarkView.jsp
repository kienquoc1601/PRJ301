<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.Student" %>
<%@ page import="model.StudentGrade" %>
<%@ page import="model.GradeItem" %>
<%@ page import="model.Course" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/grid_control.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
                  Course c = (Course)request.getAttribute("course");
         %>
         <h1><%= c.getName() %></h1>
        <form action="markView" method="POST">
            <table border="1px">
                <tr>
                    <td></td>
                    <c:forEach items="${requestScope.gradeItems}" var="a">
                        <td>${a.name}</td> 
                    </c:forEach>
                <tr/>
                <c:forEach items="${requestScope.students}" var="s">
                    <tr>
                        <td>${s.name}</td>
                        <c:forEach items="${requestScope.gradeItems}" var="a">
                            <td>
                                <input name="score${s.studentId}_${a.gradeItemId}" class="short_textfield" type="text"
                                       <c:forEach items="${requestScope.studentGrades}" var="e">   
                                           <c:if test="${e.student.studentId eq s.studentId and e.gradeItem.gradeItemId eq a.gradeItemId}">
                                               value="${e.score}"
                                           </c:if>
                                       </c:forEach>
                                       />
                                <input name="sid${s.studentId}_${a.gradeItemId}" type="hidden"
                                       <c:forEach items="${requestScope.studentGrades}" var="e">   
                                           <c:if test="${e.student.studentId eq s.studentId and e.gradeItem.gradeItemId eq a.gradeItemId}">
                                               value="${e.sid}"
                                           </c:if>
                                       </c:forEach>
                                       />
                                <input name="component" value="${s.studentId}_${a.gradeItemId}" type="hidden"
                                       />
                            
                            </td> 
                            </c:forEach>
                    <tr/>  
                </c:forEach>
            </table>
            <br/>
            <input name="c" value ="<%= c.getCourseId()%>" type="hidden">
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>