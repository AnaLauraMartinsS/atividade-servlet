<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exemplo Animal</title>

</head>
<body>
    <h1> Informações do Animal </h1>

   <div id="container">
                   <h2>Informações do Animal</h2>

                   <ul>
                       <li>Nome:</li>
                       <input value="${Nome}" disabled>

                       <li>Idade em anos:</li>
                        <input value="${Idade}" disabled>

                   </ul>
               </div>
</body>
</html>