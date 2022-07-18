<%-- 
    Document   : teacherDetailView
    Created on : Jun 28, 2022, 12:54:20 AM
    Author     : LEGION OS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="model.Teacher" %>
<%@ page import="model.Course" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/teacherDetailView.css">
    </head>
    <body>
        <div>
            <table style="width: 100%;">
                <tbody>
                    <tr style="background-color: pink;">
                        <td>Hello <a href="url">truong gia binh</a></td>
                        <td>This is a Teacher Account</td>
                        <td><a href="url">Log Out</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="header">
            <h1>Teacher Information</h1>
        </div>
        <div class="wrap">
            <div class="fleft"><img src="https://upload.wikimedia.org/wikipedia/commons/1/11/Truong_Gia_Binh_-_Chairman_%26_CEO_of_FPT_Corporation.jpg" />
                <table border="1">
                    <tbody>
                        <%
                            Teacher t = (Teacher)request.getAttribute("teacher");
                            %>
                        <tr>
                            <td style="background-color: powderblue;">Full Name(*s1)</td>
                            <td><%= t.getName() %></td>
                        </tr>
                        <tr>
                            <td style="background-color: powderblue;">Email</td>
                            <td><%= t.getEmail() %></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="fright">
                
                <table class="tab" border="1">
                    <tbody>
                        <tr>
                            <td style="background-color: powderblue;">Course (*c2)</td>
                        </tr>
                        
                        <c:forEach items="${requestScope.course}" var="c">
                            <tr>
                                <td><a href="markView?id=${c.courseId}">${c.name}</a></td>
                            </tr>   
                        </c:forEach>
                    </tbody>
                </table>
            </div>
    </body>
</html>
