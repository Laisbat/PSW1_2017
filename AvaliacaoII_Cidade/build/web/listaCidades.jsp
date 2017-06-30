<%-- 
    Document   : listaCidades
    Created on : 29/06/2017, 21:48:45
    Author     : ra21606437
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Cidades cadastradas:</h1>
        
        <table border="1px">
            <thead>
                <td>Cidade</td>
            </thead>
                <c:forEach items="${requestScope.Nome}" var="city">
                    <tr>        
                        <td>${city.nome}</td>
                    </tr>
                </c:forEach>
        </table>
    </body>
</html>
