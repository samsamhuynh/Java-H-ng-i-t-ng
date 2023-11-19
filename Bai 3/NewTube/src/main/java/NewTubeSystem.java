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

        steve.printInfo();

        // Kiểm tra steve có phải người trưởng thành không?
        steve.isOver20();

        amy.printInfo();

        // Kiểm tra amy có phải người trưởng thành không?
        amy.isOver20();
    }
}
