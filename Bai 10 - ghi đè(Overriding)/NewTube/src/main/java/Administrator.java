class Administrator extends User{
    private String adminLevel;
    public Administrator(String email, String password, String nickname, String adminLevel) {
        super(email, password, nickname);
        this.adminLevel = adminLevel;
    }

    public void login() {
        System.out.println("Hello " + this.nickname + "!");
        System.out.println("Please verify your permission : " + this.adminLevel);
    }
}
