package practicalProject.service;

public class AdminLoginService {

    private LoginService loginService;

    public void init(){
        loginService = new LoginService();
    }
}
