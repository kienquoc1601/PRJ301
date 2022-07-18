<%-- 
    Document   : login
    Created on : Jul 14, 2022, 10:30:40 AM
    Author     : LEGION OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../CSS/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <form action="../login" method="post">
                <div class="container">
                  <label for="user"><b>Username</b></label>
                  <input type="text" placeholder="Enter Username" name="user" required>

                  <label for="pass"><b>Password</b></label>
                  <input type="password" placeholder="Enter Password" name="pass" required>

                  <button type="submit">Login</button>
                  
                </div>
                <div class="container" style="background-color:#f1f1f1">
    
                </div>
         </form>
    </body>
</html>
