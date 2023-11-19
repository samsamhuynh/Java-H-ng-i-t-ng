public class NewTubeSystem {
    public static void main(String[] args) {
        UniversityUser amy = new UniversityUser();

        EnterpriseUser steve = new EnterpriseUser("s@email.com",
                "123",
                "steve",
                "Codepresso");
        steve.printEnterpriseUserInfo();

        EnterpriseUser grace = new EnterpriseUser(100, 200);
        grace.printTemporaryValues();
    }
}
