<%-- 
    Document   : resposta
    Created on : 29/06/2017, 21:05:48
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
        <h1>Dados inserido com sucesso!</h1>
        <h3>Segue abaixo a prévizualização dos dados inseridos</h3>
        <h4>Nome: ${requestScope.Nome}</h4>
        <h4>Estado: ${requestScope.Estado}</h4>
        <h4>População: ${requestScope.Populacao}</h4>
        
        <a href="listaCidades">Listar cidades</a>
        
    </body>
</html>
