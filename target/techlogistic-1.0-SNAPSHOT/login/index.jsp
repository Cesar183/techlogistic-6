<%@page import="java.sql.ResultSet"%>
<%@page import="java.beans.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></link>
        <link rel="icon" href="/techlogistic/resources/favicon.png"/>
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'/>
        <link rel="stylesheet" href="/techlogistic/resources/css/normalize.css"/>
        <link rel="stylesheet" href="/techlogistic/resources/css/techlogistic.css"/>
        <title>Techlogistic</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            if (sesion.getAttribute("logueado") == null || sesion.getAttribute("logueado").equals("0")) {
                response.sendRedirect("login/login.jsp");
            }
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
        %>
        <div class="container">
            <nav class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <a class="navbar-brand"><img src="/techlogistic/resources/favicon.png" alt="" class="navigation__image" width="40">Techlogistic</a>
                    <form class="form-inline" action="logout.jsp">
                        <a href="datosUsuario.jsp"><i class="fa-solid fa-user"></i><%=sesion.getAttribute("correo") %></a>
                        <button class="btn btn-outline-danger my-2 my-sm-0 ml-2" type="submit">Cerrar Sesión</button>
                    </form>
                </div>
            </nav>
                        
            <div class="row mt-2">
                <div class="col-sm">
                    <p><a href="/techlogistic/correo/enviarcorreo.xhtml">Enviar correo</a></p>
                    <p><a href="/techlogistic/grafico/grafico.xhtml">Gráfico compras</a></p>
                    <p><a href="/techlogistic/subirdatos/cargararchivo.xhtml">Subir datos</a></p>
                    
                    <p><a href="/techlogistic/web/categoriaMateria/List.xhtml">Show All CategoriaMateria Items</a></p>
                    <p><a href="/techlogistic/web/cliente/List.xhtml">Show All cliente Items</a></p>
                    <p><a href="/techlogistic/web/correos/List.xhtml">Show All correos Items</a></p>
                    <p><a href="/techlogistic/web/cotizaciones/List.xhtml">Show All cotizaciones Items</a></p>
                    <p><a href="/techlogistic/web/direcciones/List.xhtml">Show All direcciones Items</a></p>
                    <p><a href="/techlogistic/web/funcionario/List.xhtml">Show All funcionario Items</a></p>
                    <p><a href="/techlogistic/web/materiaPrima/List.xhtml">Show All materiaPrima Items</a></p>
                    <p><a href="/techlogistic/web/materiaProducto/List.xhtml">Show All materiaProducto Items</a></p>
                    <p><a href="/techlogistic/web/medioPago/List.xhtml">Show All medioPago Items</a></p>
                    <p><a href="/techlogistic/web/ordenVenta/List.xhtml">Show All ordenVenta Items</a></p>
                    <p><a href="/techlogistic/web/ordenVentaProducto/List.xhtml">Show All ordenVentaProducto Items</a></p>
                    <p><a href="/techlogistic/web/pedidos/List.xhtml">Show All pedidos Items</a></p>
                    <p><a href="/techlogistic/web/personas/List.xhtml">Show All personas Items</a></p>
                    <p><a href="/techlogistic/web/producto/List.xhtml">Show All producto Items</a></p>
                    <p><a href="/techlogistic/web/proveedorMateria/List.xhtml">Show All proveedorMateria Items</a></p>
                    <p><a href="/techlogistic/web/proveedores/List.xhtml">Show All proveedores Items</a></p>
                    <p><a href="/techlogistic/web/roles/List.xhtml">Show All roles Items</a></p>
                    <p><a href="/techlogistic/web/stock/List.xhtml">Show All stock Items</a></p>
                    <p><a href="/techlogistic/web/categoriaMateria/List.xhtml">Show All CategoriaMateria Items</a></p>
                </div>
            </div>
        </div>
    </body>
</html>
