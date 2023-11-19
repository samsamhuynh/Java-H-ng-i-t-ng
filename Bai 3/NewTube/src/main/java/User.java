public class User {
    String email;
    String password;
    String nickname;
    int age;

    void printInfo() {
        System.out.println("\nUser Info" +
                "\nemail: " + email +
                "\nnickname: " + nickname +
                "\nage: " + age);
    }

    void isOver20() {
        if(age < 20) {
            System.out.println("\n" + nickname + " is under 20");
        } else {
            System.out.println("\n" + nickname + " is over 20");
        }
    }
}
