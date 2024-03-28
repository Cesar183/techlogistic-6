<%@page import="java.sql.*"%>
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
                        <a href="datosUsuario.jsp"><i class="fa-solid fa-user"></i><%=sesion.getAttribute("correo")%></a>
                        <button class="btn btn-outline-danger my-2 my-sm-0 ml-2" type="submit">Cerrar Sesión</button>
                    </form>
                </div>

            </nav>
            <div class="container-fluid">
                <ul class="navigation__list">
                    <li><a href="#hero" class="navigation__link">Funcionarios</a></li>
                    <li><a href="/techlogistic/correo/enviarcorreo.xhtml" class="navigation__link">Enviar correo</a></li>
                    <li><a href="/techlogistic/grafico/grafico.xhtml" class="navigation__link">Gráfico compras</a></li>
                    <li><a href="/techlogistic/subirdatos/cargararchivo.xhtml" class="navigation__link">Subir datos</a></li>
                </ul>
            </div>
            <div class="row mt-2">
                <div class="col-sm">

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
        <main class="container my-5 h-100">
            <h4 class="text-md-start text-left">Bienvenida/o a Techlogistic</h4>
            <hr>
            <div>
                <ul class="navbar-nav ms-auto me-4 mb-2 mb-lg-0">
                    <div class="collapse navbar-collapse" id="navbarNavDropdown">
                        <ul class="navbar-nav ms-auto me-4 mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="./indexdash.php">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="button" href="./sign-up.html">Registrar funcionario</a>
                            </li>
                            <li class="nav-item">
                                <h5>Administrador</h5>
                            </li>
                            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                                <ul class="navbar-nav ms-auto me-4 mb-2 mb-lg-0">
                                    <li class="nav-item">
                                        <a class="nav-link active" aria-current="page" href="./indexdash.php">Inicio</a>
                                    </li>
                                    <a class="nav-link">Vendedor</a>

                                </ul>
                            </div>
                        </ul>
                    </div>
                    <!-- 4 Cards -->
                    <div class="row g-4">
                        <div class="col-md-6">
                            <div class="card h-100">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title">Proveedores</h5>
                                    <p class="card-text mb-4">Permite la creación, almacenamiento y actualización de
                                        información detallada
                                        de los proveedores.</p>
                                    <div class="mt-auto">
                                        <a href="/techlogistic/web/proveedores/List.xhtml" class="button">Ir a
                                            proveedores</a></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card h-100">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title">Producción</h5>
                                    <p class="card-text mb-4">Se genera la creación, modificación y eliminación del producto
                                        final,
                                        facilitando la generación y consulta de informes de producción.</p>
                                    <div class="mt-auto">
                                        <a href="./dashboard/produccion/indexproduccion.php" class="button">Ir a
                                            Producción</a></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card h-100">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title">Inventario</h5>
                                    <p class="card-text mb-4">Mantén un registro detallado del inventario de productos,
                                        ventas y pedidos.
                                        Gestiona la existencia de productos en bodega, registra reportes de ventas y
                                        pedidos, y controla las
                                        devoluciones.</p>
                                    <div class="mt-auto">
                                        <a href="./dashboard/inventario/indexinventario.php" class="button">Ir a
                                            Inventario</a></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card h-100">
                                <div class="card-body d-flex flex-column">
                                    <h5 class="card-title">Ventas</h5>
                                    <p class="card-text mb-4">Administra el proceso de ventas, desde el registro de la venta
                                        hasta la
                                        generación
                                        de facturas y cotizaciones.</p>
                                    <div class="mt-auto">
                                        <a href="./dashboard/ventas/indexventas.php" class="button">Ir a Ventas</a></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
        </main>  
        <footer>
            <div class="copyright">
                <div class="bd-container">
                    <p>💙 © 2023 Techlogistic. Todos los derechos reservados. 💚</p>
                    <p><a href="./terminos-y-condiciones.html">Términos y Condiciones</a> · <a
                            href="./politica-de-privacidad.html">Política de Privacidad</a></p>
                </div>
            </div>
        </footer>                
    </body>
</html>
