<%-- 
    Document   : Calculadora
    Created on : 26/09/2020, 18:33:49
    Author     : baquiax
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora Basica</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <br/>
        <h2>Ingrese los numeros: </h2>

        <form method="GET" action="ConcetorCalculadora">
            <p>Ingrese el primer numero: </p>
            <input type="text" name="num1" />
            <br />
            <p>Ingrese el segundo numero: </p>
            <input type="text" name="num2" />
            <br />
            <div>
                <br />
                <input type="radio" name="suma" value="1" />Suma
                <br />
                <input type="radio" name="resta" value="1" />Resta 
                <br />
                <input type="radio" name="multiplicacion" value="1" />Multiplicacion
                <br />
                <input type="radio" name="division" value="1" />Division
                <br />
                <input type="radio" name="numMayor" value="1" />Hallar el numero mayor
                <br />
                <input type="radio" name="potencia" value="1" />Potenciacion
                <br />
                <input type="radio" name="binario" value="1" />Hallar el binario
                <br />
            </div>
            <br />
            <input type="submit" value="Calcular" />
            <input type="reset" value= "Limpiar"  >
        </form>
        <%=(String) request.getAttribute("Resultado")%>
    </body>
</html>
