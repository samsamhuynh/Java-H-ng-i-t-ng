public class NewTubeSystem {
    public static void main(String[] args) {
        User grace = new User("g@email.com",
                "123",
                "grace");
        PaidUser luke = new PaidUser("l@email.com",
                "123",
                "luke",
                "Pro");
        EnterpriseUser steve = new EnterpriseUser("s@email.com",
                "123",
                "steve",
                "Codepresso");
        Administrator amy = new Administrator("a@email.com",
                "123",
                "amy",
                "LV2");

        grace.login();
        luke.login();
        steve.login();
        amy.login();
    }
}
