public class User {
    protected String email;
    protected String password;
    protected String nickname;

    public void login() {
        System.out.println("Hello " + this.nickname + "!");
        System.out.println("Login Succeed!");
    }

    public void printUserInfo() {
        System.out.println("- email : " + this.email);
        System.out.println("- password : " + this.password);
        System.out.println("- nickname : " + this.nickname);
    }
}
