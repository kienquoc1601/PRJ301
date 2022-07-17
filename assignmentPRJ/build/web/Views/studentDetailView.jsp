<%-- 
    Document   : studentDetailView
    Created on : Jun 20, 2022, 9:50:06 PM
    Author     : LEGION OS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.Student" %>
<%@ page import="model.Major" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/studentDetailView.css">
         
    </head>
    <body>
        <div>
            <table style="width:100%">
                <tr style="background-color:powderblue;">
                    <td>Hello <a href="url">truong gia binh</a></td>
                    <td>This is a Student Account</td>
                    <td><a href="url">Log Out</a></td>
                </tr>
            </table>
        </div>
        <div class = "header">
            <h1>Student Information</h1>
        </div>
        <div class="wrap">
            <div class="fleft">
                <img src="https://upload.wikimedia.org/wikipedia/commons/1/11/Truong_Gia_Binh_-_Chairman_%26_CEO_of_FPT_Corporation.jpg" >
                <table border="1">
                    <tbody>
                            <%
                            Student s = (Student)request.getAttribute("student");
                            
                            
                            %>
                       
                        <tr>
                            <td style="background-color:powderblue;">Full Name(*s1)</td>
                            <td ><%= s.getName() %></td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">DOB</td>
                            <td><%= s.getDob() %></td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Gender</td>
                            <td><%= s.isGender() %></td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Roll Number</td>
                            <td><%= s.getRollNumber() %></td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Major</td>
                            <td><%= s.getMajor().getMajorName() %></td>
                        </tr>
                        
                    </tbody>
                </table>
            </div>

            <div class="fright">
                <div style = "padding-left : 20% ; padding-bottom : 10px;">
                    <label for="cars">Choose Semester:(*c1)</label>
                    <select id="cars" name="cars">
                        <option value="volvo">sum2022</option>
                        <option value="saab">spring2022</option>
                        <option value="fiat">winter2022</option>

                    </select>
                </div>

                <table class = "tab" border="1">
                    <tbody>
                        <tr>
                            <td style="background-color:powderblue;">Course (*c2)</td>
                        </tr>
                        <c:forEach items="${requestScope.course}" var="c">
                            <tr>
                                <td><a href="mark?id=${c.courseId}">${c.name}</a></td>
                            </tr>   
                        </c:forEach>
                        
                    </tbody>
                </table>

            </div>

        </div>

    </body>
</html>
