public class NewTubeSystem {
    public static void main(String[] args) {
        User amy = new User();
        User grace = new User("g@s.kr",
                "123");
        User steve = new User("s@s.kr",
                "123",
                "s",
                19);

        amy.printInfo();
        grace.printInfo();
        steve.printInfo();
    }
}
