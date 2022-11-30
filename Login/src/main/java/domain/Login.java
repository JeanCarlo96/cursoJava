package domain;

public class Login {

    private Integer idLogin;
    private String userName;
    private String password;

    public Login() {
    }

    public Login(int idLogin) {
        this.idLogin = idLogin;
    }

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Login(int idLogin, String userName, String password) {
        this.idLogin = idLogin;
        this.userName = userName;
        this.password = password;
    }

    public Integer getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Integer idLogin) {
        this.idLogin = idLogin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" + "idLogin=" + idLogin + ", userName=" + userName + ", password=" + password + '}';
    }
    
}
