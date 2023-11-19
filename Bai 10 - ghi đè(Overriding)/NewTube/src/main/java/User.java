class User {
    protected String email;
    protected String password;
    protected String nickname;
//    protected int temporaryValue;

//    public User() {
//        System.out.println("Init User");
//    }

    public User(String email, String password, String nickname) {
//        System.out.println("Init User with 3 parameters");
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public void login() {
        System.out.println("Hello " + this.nickname + "!");
        System.out.println("Login Succeed!");
    }

//    public void printUserInfo() {
//        System.out.println("- email : " + this.email);
//        System.out.println("- password : " + this.password);
//        System.out.println("- nickname : " + this.nickname);
//    }
}
