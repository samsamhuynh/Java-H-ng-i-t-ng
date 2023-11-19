public class NewTubeSystem {
    public static void main(String[] args) {
        User steve = new User();
        User amy = new User();

        steve.email = "steve@gmail.com";
        steve.password = "123123";
        steve.nickname = "steve";
        steve.age = 22;

        amy.email = "amy@gmail.com";
        amy.password = "123123";
        amy.nickname = "iamamy";
        amy.age = 17;

        System.out.println("User Info" +
                "\nemail: " + steve.email +
                "\nnickname: " + steve.nickname +
                "\nage: " + steve.age);

        // Kiểm tra steve có phải người trưởng thành không?
        if(steve.age < 20) {
            System.out.println("\n" + steve.nickname + " is under 20");
        } else {
            System.out.println("\n" + steve.nickname + " is over 20");
        }

        System.out.println("User Info" +
                "\nemail: " + amy.email +
                "\nnickname: " + amy.nickname +
                "\nage: " + amy.age);

        // Kiểm tra amy có phải người trưởng thành không?
        if(amy.age < 20) {
            System.out.println("\n" + amy.nickname + " is under 20");
        } else {
            System.out.println("\n" + amy.nickname + " is over 20");
        }
    }
}
