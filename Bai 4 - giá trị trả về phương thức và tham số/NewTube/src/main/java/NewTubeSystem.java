public class NewTubeSystem {
    public static void main(String[] args) {
        User steve = new User();

        steve.setEmail("steve@gmail.com");
        steve.setPassword("123");
        steve.setNickname("steve");
        steve.setAge(22);

        if (steve.isOver20()) {
            System.out.println("You can pay for subcription.");
        } else {
            System.out.println("You cannot pay for subcription.");
        }
    }
}
