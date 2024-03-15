<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"></link>
        <title>Cambio de contraseña</title>
    </head>
    <body>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form>
                        <div class="mb-3">
                            <label>Correo</label>
                            <input type="email" class="form-control" name="correo" placeholder="correo">
                        </div>
                        <div class="mb-3">
                            <label>Contraseña</label>
                            <input type="password" class="form-control" name="password1" placeholder="contrseña">
                        </div>
                        <div class="mb-3">
                            <label>Confirme contraseña</label>
                            <input type="password" class="form-control" name="password2" placeholder="repita contraseña">
                        </div>
                        <button type="submit" name="guardar" class="btn btn-primary">Guardar</button>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
