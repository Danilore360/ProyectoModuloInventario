<%-- 
    Document   : mostrarUsuarios
    Created on : 9 dic. 2023, 17:44:28
    Author     : Danilore
--%>

<%@page import="com.danilore.proyectomoduloinventario.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuarios Registrados</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="../css/Estilos_Principal.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="../css/header.css" rel="stylesheet" />
    </head>
    <body>


        <div class="container-fluid">
            <div class="row">
                <%@include file="../components/menu.jsp" %>
                <!-- Contenido principal -->
                <main role="main" class="col-md-9 ml-sm-auto col-lg-10 px-4">
                    <!-- Resto del contenido de la página -->
                    <center>
                        <header class="nom-empre">

                            <h1 class="agroarte">Modulo de Inventario</h1>

                        </header>
                    </center>

                    <br><br><br><br><br>


                    <font style="color: black;" align="center">
                    <h1>Lista de Usuarios Registrados</h1>
                    <br>
                    </font>
                    <div class="row">
                        <div class="col">
                            <center>

                                <a type="button" class="btn btn-primary" href="addUsuarios.jsp">Agregar Nuevo</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <button type="button" onclick="window.print()"
                                        style="background-color: green; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer;">Imprimir</button>
                            </center>
                        </div>
                    </div>
                    <br>
                    <div class="container ">

                            <table class="table" ID="empleados">
                                <thead class="table-success  ">
                                    <tr>
                                        <th>CODIGO</th>
                                        <th>CORREO</th>
                                        <th>CARGO</th>
                                        <th>ESTADO</th>
                                        <th>FECHA DE CREACIÓN</th>
                                        <th>ACCIONES</th>
                                    </tr>
                                </thead>

                                <tbody class="table-light">
                                    <%
                                        List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");

                                        for (Usuario usu : listaUsuarios) {


                                    %>

                                    <tr>
                                        <th>
                                            <%=usu.getId_usuario()%>
                                        </th>
                                        <th>
                                            <%=usu.getCorreo_usuario()%>
                                        </th>
                                        <th>
                                            <%=usu.getId_cargo()%>
                                        </th>
                                        <th>
                                            <%=usu.getId_estado()%>
                                        </th>
                                        <th>
                                            <%=usu.getFecha_creacion()%>
                                        </th>

                                        <th>
                                            <form class="btn btn-info" action="../SvEditarUsuario" method="GET">
                                                <input type="hidden" name="id_usuarioEdit" value="<%=usu.getId_usuario()%>">
                                                <button class="btn btn-info"  type="submit">Editar</button>
                                            </form>
                                            <form class="btn btn-danger" action="../SvBajaUsuario" method="POST">
                                                <input type="hidden" name="id_usuario" value="<%=usu.getId_usuario()%>">
                                                <button class="btn btn-danger"  type="submit">Dar de Baja</button>
                                            </form>  

                                        </th>

                                    </tr>
                                    <%}%>
                                </tbody>
                            </table>


                    </div>



                </main>
            </div>
        </div>

        <!-- JavaScript y jQuery necesarios para Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>








    </body>
</html>
