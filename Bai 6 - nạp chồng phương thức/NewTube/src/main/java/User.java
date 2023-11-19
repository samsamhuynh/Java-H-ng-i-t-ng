public class User {
    private String email;
    private String password;
    private String nickname;
    private int age;

    public User() {
        this.email = "default@codepresso.kr";
        this.password = "123";
        this.nickname = "default";
        this.age = 20;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String email, String password, String nickname, int age) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        } else if (age > 120) {
            age = 120;
        }
        this.age = age;
    }

    public void printInfo() {
        System.out.println("\nUser Info" +
                "\nemail: " + email +
                "\nnickname: " + nickname +
                "\nage: " + age);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= 20;
    }

    public boolean isAdult(int age) {
        return this.age >= age;
    }
}
