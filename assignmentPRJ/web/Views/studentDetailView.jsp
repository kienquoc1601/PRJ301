<%-- 
    Document   : studentDetailView
    Created on : Jun 20, 2022, 9:50:06 PM
    Author     : LEGION OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="../CSS/studentDetailView.css">
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
                        <tr>
                            <td style="background-color:powderblue;">Full Name</td>
                            <td >&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">DOB</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Gender</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Roll Number</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Major</td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td style="background-color:powderblue;">Email</td>
                            <td>&nbsp;</td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <div class="fright">
                <div style = "padding-left : 20% ; padding-bottom : 10px;">
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
                            <td style="background-color:powderblue;">Subject </td>
                        </tr>
                        <tr>
                            <td><a href="url">MAE</a></td>
                        </tr>
                        <tr>
                            <td><a href="url">PRN</a></td>
                        </tr>
                        <tr>
                            <td><a href="url">PRJ</a></td>
                        </tr>
                        <tr>
                            <td><a href="url">MAD</a></td>
                        </tr>
                        <tr>
                            <td><a href="url">SWP</a></td>

                        </tr>
                        <tr>
                            <td><a href="url">SWR</a></td>
                        </tr>
                        <tr>
                            <td><a href="url">SWT</a></td>

                        </tr>
                    </tbody>
                </table>

            </div>

        </div>

    </body>
</html>
