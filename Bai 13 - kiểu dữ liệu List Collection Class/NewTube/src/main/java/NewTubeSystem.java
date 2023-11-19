public class NewTubeSystem {
    public static void main(String[] args) {
        User user = new User("g@email.com", "111", "grace");
        user.viewCourse("1111");
        user.viewCourse("2222");
        user.viewCourse("3333");

        user.removeViewHistory("2222");
        user.removeViewHistory("4444");

        user.removeViewHistory(0);

        user.clearViewHistory();
    }
}
