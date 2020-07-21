<%-- 
    Document   : Persona
    Created on : 16/12/2019, 08:52:37 PM
    Author     : CET
--%>

<%@page import="java.util.List"%>
<%@page import="servicio.Persona"%>
<%@page import="modelo.PersonaService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
  <body>
         <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <a href="Controlador?accion=add" class="btn btn-primary" >Nueva Persona </a>
                </div>  
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>CODIGO PERSONA</th>
                                <th>NOMBRE</th>
                                <th>APELLIDO</th>
                                <th>TELÉFONO</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                               PersonaService person= new PersonaService();
                               List<Persona> datos= person.listar();
                            for(Persona p:datos){
                            %>
                            <tr>
                                <th><%= p.getCodigoPersona()%></th>
                                <th><%= p.getNombre()%></th>
                                <th><%= p.getApellido()%></th>
                                <th><%= p.getTel()%></th>
                                <th>
                                    <a href="" class="btn btn-warning">Edit</a>
                                    <a href="" class="btn btn-danger">Delete</a>
                                </th>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                   
                </div>
            </div>                    
        </div>
    </body>
</html>
