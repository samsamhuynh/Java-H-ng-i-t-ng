import java.util.ArrayList;

class User {
    protected String email;
    protected String password;
    protected String nickname;
    private ArrayList<String> viewHistory;

    public User() {

    }

    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.viewHistory = new ArrayList<>();
    }

    public void login() {
        System.out.println("Checking email and password");
        System.out.println("Hello " + this.nickname + "!");
    }

    public void enterPage() {
        System.out.println("Enter the default page!");
    }

    public void viewCourse(String courseId) {
        viewHistory.add(courseId);
        this.showViewHistoryinfo();
    }

    public void showViewHistoryinfo() {
        System.out.println(this.viewHistory);
        System.out.println("course view count : " + this.viewHistory.size());
        System.out.println();
    }

    public void removeViewHistory(String courseId) {
        boolean result = this.viewHistory.remove(courseId);
        if (result) {
            System.out.println(courseId + " course is removed from view history");
        } else {
            System.out.println(courseId + " course is not in history");
        }
        this.showViewHistoryinfo();
    }

    public void removeViewHistory(int viewIndex) {
        String removedCourseId = this.viewHistory.remove(viewIndex);
        System.out.println("course " + removedCourseId + " is removed from view history");
        this.showViewHistoryinfo();
    }

    public void clearViewHistory() {
        this.viewHistory.clear();
        this.showViewHistoryinfo();
    }
}
