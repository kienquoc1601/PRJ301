<%-- 
    Document   : markView
    Created on : Jul 18, 2022, 3:34:26 AM
    Author     : LEGION OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.Student" %>
<%@ page import="model.StudentGrade" %>
<%@ page import="model.GradeItem" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS/markView.css">
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
            <h1>Academic report</h1>
        </div>

        <div class="wrap">
            <div class="fleft">

                <div style = "padding-top : 10%; padding-left : 20% ; padding-bottom : 20px;">
                    <label for="cars">Choose Semester:</label>
                    <select id="cars" name="cars">
                        <option value="volvo">sum2022</option>
                        <option value="saab">spring2022</option>
                        <option value="fiat">winter2022</option>

                    </select>
                </div>

                <table class = "tab" border="1">
                    <tbody>
                        <tr>
                            <td style="background-color:powderblue;">Course(*c1) </td>
                            <td style="background-color:powderblue;">Course name </td>
                        </tr>
                        <tr>
                            <td><a href="url">MAE</a></td>
                            <td>Math for Programing</td>
                        </tr>
                        <tr>
                            <td><a href="url">PRN</a></td>
                            <td>Cross Platform Programing</td>
                        </tr>
                        <tr>
                            <td><a href="url">PRJ</a></td>
                            <td>Java Web Application</td>
                        </tr>
                        <tr>
                            <td><a href="url">MAD</a></td>
                            <td>Discrete Mathematic</td>
                        </tr>
                        <tr>
                            <td><a href="url">SWP</a></td>
                            <td>Something programing</td>

                        </tr>
                        <tr>
                            <td><a href="url">SWR</a></td>
                            <td>Software requirement</td>
                        </tr>
                        <tr>
                            <td><a href="url">SWT</a></td>
                            <td>Software testing</td>
                        </tr>
                    </tbody>
                </table>
            </div>


            <div class="fright">
                <h2 style="text-align : center">Subject : MAE</h2>
                <table class = "tab2" border="1">
                    <tbody>
                        <tr>
                            <td style="background-color:powderblue;">Grade Item (*g1)</td>
                            <td style="background-color:powderblue;">Weight </td>
                            <td style="background-color:powderblue;">Value </td>
                        </tr>
                        <tr>
                            <td>Workshop 1</td>
                            <td>5%</td>
                            <td>1</td>
                        </tr>
                        <c:forEach items="${requestScope.grades}" var="g">
                            <tr>
                                <td>${g.gradeItem.name}</td>
                                <td>${g.gradeItem.weight}</td>
                                <td>${g.score}</td>
                            </tr>   
                        </c:forEach>
                    </tbody>
                </table>
            </div>

        </div>

    </body>
</html>
