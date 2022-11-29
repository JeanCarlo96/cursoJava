package test;

import datos.LoginDAO;
import domain.Login;
import java.util.List;

public class TestManejoLogin {

    public static void main(String[] args) {

        LoginDAO loginDao = new LoginDAO();

        // Insert
        Login loginNuevo = new Login("bryan", "123");
        loginDao.insertar(loginNuevo);

        // Select
        List<Login> logins = loginDao.seleccionar();
        for (Login login : logins) {
            System.out.println(login);
        }
        
        Login loginModificado = new Login(1, "superAdmin", "4265");
        // Actualizar
        loginDao.actualizar(loginModificado);
        
        // Delete
        Login loginEliminar = new Login(6);
        loginDao.eliminar(loginEliminar);
    }

}
