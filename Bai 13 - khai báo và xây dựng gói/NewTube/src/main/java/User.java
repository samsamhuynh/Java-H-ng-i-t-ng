class User {
    protected String email;
    protected String password;
    protected String nickname;

    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }

    public void login() {
        System.out.println("Checking email and password");
        System.out.println("Hello " + this.nickname + "!");
    }

    public void enterPage() {
        System.out.println("Enter the default page!");
    }
}
