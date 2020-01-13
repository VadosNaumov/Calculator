<%--
  Created by IntelliJ IDEA.
  User: Vados
  Date: 12-Jan-20
  Time: 2:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- Static content -->
    <link rel="stylesheet" href="/resources/css/style.css">
    <script type="text/javascript" src="/resources/js/app.js"></script>

    <title>Spring Boot</title>
</head>
<body bgcolor="f5f1e4">
<h1 align="center">Calculator, Go!</h1>
<hr>
<br>
<br>
<div class="form" align="center">
    <form action="calculation" method="post" onsubmit="return validate2()">
        <table>
            <tr>
                <td>Enter Your calculation </td>
                <td><input id="expression" name="express"></td>
                <td><input type="submit" value="Calculate"></td>
             </tr>
         </table>
     </form>
 </div>

 </body>
 </html>