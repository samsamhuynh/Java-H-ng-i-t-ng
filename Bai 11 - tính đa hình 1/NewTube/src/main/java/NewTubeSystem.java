public class NewTubeSystem {
    public static void main(String[] args) {
        User user = new PaidUser("l@email.com",
                "123",
                "luke",
                "Pro");
        user.login();

        user = new EnterpriseUser("s@email.com",
                "123",
                "steve",
                "Codepresso");
        user.login();

        user = new Administrator("a@email.com",
                "123",
                "amy",
                "LV2");
        user.login();
    }
}
