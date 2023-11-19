public class NewTubeSystem {
    public static void main(String[] args) {
        PaidUser luke = new PaidUser();

        luke.email = "luke@email.com";
        luke.nickname = "luke";
        luke.password = "123";
        luke.membership = "PRO";

        luke.login();
        luke.printUserInfo();
    }
}
