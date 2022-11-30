package web;

import datos.LoginDAO;
import domain.Login;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Login> logins = new LoginDAO().listar();
        System.out.println("Logins = " + logins);
        request.setAttribute("logins", logins);
        request.getRequestDispatcher("logins.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if(request.getParameter("btn-login") != null){
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");
            Login loginIngresado = new Login(usuario, password);
            int respuesta = new LoginDAO().buscar(loginIngresado);
            if(respuesta != 0){
                response.sendRedirect("/Login/principal.jsp");                
            }else{
                response.sendRedirect("/Login/logins.jsp?respuesta="+respuesta);
            }
        }
        
  
    }

}
