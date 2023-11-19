public class LoginManager {
    public void processLogin(PaidUser paidUser) {
        System.out.println("process something before login");
        paidUser.login();
        paidUser.enterPage();
        System.out.println("process something after login\n");
    }

    public void processLogin(EnterpriseUser enterpriseUser) {
        System.out.println("process something before login");
        enterpriseUser.login();
        enterpriseUser.enterPage();
        System.out.println("process something after login\n");
    }

    public void processLogin(Administrator administrator) {
        System.out.println("process something before login");
        administrator.login();
        administrator.enterPage();
        System.out.println("process something after login\n");
    }

    public void processLogin(UniversityUser universityUser) {
        System.out.println("process something before login");
        universityUser.login();
        universityUser.enterPage();
        System.out.println("process something after login\n");
    }
}
