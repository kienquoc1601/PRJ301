<%-- 
    Document   : courseMarkView
    Created on : Jun 28, 2022, 1:26:15 AM
    Author     : LEGION OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link rel="stylesheet" type="text/css" href="../CSS/courseMarkView.css">
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
        <div class="wrap">
            <div class="option">
                <form action="/action_page.php">
                    <div style = "padding-top : 10%; padding-left : 20% ; padding-bottom : 20px;">
                        <label for="semester">Choose Semester :</label>
                        <select id="semester" name="semester">
                            <option value="volvo">sum2022</option>
                            <option value="saab">spring2022</option>
                            <option value="fiat">winter2022</option>
                        </select>
                        <label for="course">Choose Course :</label>
                        <select id="course" name="course">
                            <option value="volvo">sum2022</option>
                            <option value="saab">spring2022</option>
                            <option value="fiat">winter2022</option>
                        </select>
                        <input type="submit" value="Submit">
                    </div>

                </form>

            </div>


            <div class="tab">
                <h2 style="text-align : center">Course : MAE</h2>
                <h2 style="text-align : center">Semester : MAE</h2>
                <form action="/action_page.php">
                    <table class = "tab2" border="1">
                        <tbody>
                            <tr>
                                <th class="col">Student(*g1)</th>
                                <th class="col">Workshop 1</th>
                                <th class="col">Workshop 2</th>
                                <th class="col">Practice 1</th>
                                <th class="col">Practive 2</th>
                                <th class="col">Practical Test</th>
                                <th class="col">Final Test</th>
                                <th class="col">Average</th>
                            </tr>
                            <tr>
                                <td>Student 1</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 2</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 3</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 3</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 4</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>

                            </tr>
                            <tr>
                                <td>Student 5</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 6</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 7</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                            <tr>
                                <td>Student 8</td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                                <td><input type="text" value="4" class = "txtb"></td>
                            </tr>
                        </tbody>
                    </table>
                    <input type="submit" value="Submit">
                </form>
            </div>     
        </div>   
    </body>
</html>
