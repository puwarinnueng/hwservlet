<style>
    body {
        background-color: greenyellow;
    }
</style>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet BasicCalculator</title>
    </head>
    <body>
        <h1 align="center">
            The result of <%=Double.valueOf(request.getParameter("NumOne"))%><%=request.getAttribute("symbol")%><%=Double.valueOf(request.getParameter("NumTwo"))%>
            is: <%=request.getAttribute("answer")%>
        </h1>
    </body>
</html>
