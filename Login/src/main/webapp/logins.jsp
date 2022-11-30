<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso App</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    </head>
    <%  String respuesta="";
        if(request.getParameter("respuesta") != null){
            int r = Integer.parseInt(request.getParameter("respuesta"));
            if(r==0){
                respuesta = "Error: Usuario y/o Contraseña Incorrectos";
            }
        }
     %>
    <body>
        <form name="form1" action="/Login/ServletControlador" method="post">
            <div class="container text-center">
                <div class="row">
                    <div class="col">
                    </div>
                    <div class="col-6">
                        <h1>Sistema ABC</h1>
                    </div>
                    <div class="col">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                    </div>
                    <div class="col-5">
                        <h2>Login</h2>
                    </div>
                    <div class="col">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label class="form-label">Usuario:</label> 
                    </div>
                    <div class="col-5">
                        <input type="text" name="usuario" class="form-control" placeholder="Ingrese su Usuario"/>
                    </div>
                    <div class="col">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label class="form-label">Password: </label>
                    </div>
                    <div class="col-5">
                        <input type="password" name="password" class="form-control" placeholder="Ingrese la Contraseña"/>
                    </div>
                    <div class="col">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                    </div>
                    <div class="col-5">
                        <input type="submit" value="Enviar" name="btn-login" class="btn btn-success"/>
                    </div>
                    <div class="col">
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                    </div>
                    <div class="col-5">
                        <label class="form-label text-danger"><%= respuesta %></label> 
                    </div>
                    <div class="col">
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
