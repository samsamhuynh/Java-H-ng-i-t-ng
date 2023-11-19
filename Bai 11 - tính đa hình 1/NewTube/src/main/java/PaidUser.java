class PaidUser extends User {
    private String membership;

    public PaidUser(String email, String password, String nickname, String membership) {
        super(email, password, nickname);
        this.membership = membership;
    }

    public void login() {
        System.out.println("Hello " + this.nickname + "!");
        System.out.println("Enter the " + this.membership + " Membership Page!");
    }
}
