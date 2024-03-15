
<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></link>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form method="post" action="login.jsp">
                        <div class="mb-3">
                            <label>Correo</label>
                            <input type="text" class="form-control" name="correo" placeholder="Ingrese su correo">
                            </input>
                        </div>
                        <div class="mb-3">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Ingrese su contraseña">
                            </input>
                        </div>
                        <button type="submit" class="btn btn-primary" name="login">Login</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
    <%
        
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        if(request.getParameter("login") != null){
            String correo=request.getParameter("correo");
            String password=request.getParameter("password");
            HttpSession sesion=request.getSession();
            try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/techlogistic?useSSL=false", "root", "admin");
                    st = con.createStatement();
                    rs = st.executeQuery("SELECT * FROM `correos` where correo='"+correo+"' and password='"+password+"';");
                    while(rs.next()){
                        sesion.setAttribute("logueado", "1");
                        sesion.setAttribute("correo", rs.getString("correo"));
                        sesion.setAttribute("id", rs.getString("id_correo"));
                        response.sendRedirect("index.jsp");
                    }
                    out.println("<p style='color:red;'>Correo o contraseña incorrectos</p>");
                } catch (Exception e) {
                    out.print("Error: " + e.getMessage());
                }
        }
        
        /*
        try {
            if(request.getParameter("login") != null){
            String correo=request.getParameter("correo");
            String password=request.getParameter("password");
            HttpSession sesion=request.getSession();
            if(correo.equals("admin") && password.equals("admin")){
                sesion.setAttribute("logueado", "1");
                sesion.setAttribute("correo", correo);
                response.sendRedirect("inicio.jsp");
            }
            else{
                out.println("Usuario o contraseña invalidos");
            }
        }
        } catch (Exception e) {
        }*/
    %>
</html>
