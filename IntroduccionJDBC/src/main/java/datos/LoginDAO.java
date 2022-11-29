package datos;

import domain.Login;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static datos.Conexion.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginDAO {

    private static final String SQL_SELECT = "SELECT idlogin, username, password FROM login";
    private static final String SQL_INSERT = "INSERT INTO login(username, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE login SET username = ?, password = ? WHERE idLogin = ?";
    private static final String SQL_DELETE = "DELETE FROM login WHERE idLogin = ?";

    public List<Login> seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Login login = null;
        List<Login> logins = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idLogin = rs.getInt("idlogin");
                String userName = rs.getString("username");
                String password = rs.getString("password");

                login = new Login(idLogin, userName, password);

                logins.add(login);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return logins;
    }

    public int insertar(Login login) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, login.getUserName());
            stmt.setString(2, login.getPassword());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int actualizar(Login login) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, login.getUserName());
            stmt.setString(2, login.getPassword());
            stmt.setInt(3, login.getIdLogin());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Login login) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, login.getIdLogin());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
