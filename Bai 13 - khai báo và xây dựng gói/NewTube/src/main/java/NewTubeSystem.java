public class NewTubeSystem {
    public static void main(String[] args) {
        LoginManagerImproved loginManager = new LoginManagerImproved();

        User user = new PaidUser("l@email.com",
                "123",
                "luke",
                "Pro");
        loginManager.processLogin(user);

        user = new EnterpriseUser("s@email.com",
                "123",
                "steve",
                "Codepresso");
        loginManager.processLogin(user);

        user = new Administrator("a@email.com",
                "123",
                "amy",
                "LV2");
        loginManager.processLogin(user);
    }
}
