import java.util.ArrayList;
import java.util.HashMap;

class User {
    protected String email;
    protected String password;
    protected String nickname;
    private HashMap<String, String> validCourseDetail;
    private ArrayList<HashMap> viewHistoryDetail;

    public User() {

    }

    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.validCourseDetail = new HashMap<>();
        validCourseDetail.put("id", null);
        validCourseDetail.put("name", null);
        validCourseDetail.put("level", null);
        validCourseDetail.put("runtime", null);
        this.viewHistoryDetail = new ArrayList<>();
    }

    public void login() {
        System.out.println("Checking email and password");
        System.out.println("Hello " + this.nickname + "!");
    }

    public void enterPage() {
        System.out.println("Enter the default page!");
    }

    public void viewCourse(HashMap<String, String> courseDetail) {
        this.viewHistoryDetail.add(courseDetail);
        this.showViewHistoryinfo();
    }

    public void showViewHistoryinfo() {
        System.out.println(this.viewHistoryDetail);
        System.out.println("course view count : " + this.viewHistoryDetail.size());
        System.out.println();
    }

    public void checkValidCourse(HashMap<String, String> courseDetail) {
        this.checkCourseKey(courseDetail);
        this.checkCourseValue(courseDetail);
    }

    private void checkCourseKey(HashMap<String, String> courseDetail) {
        ArrayList<String> courseKeys = new ArrayList<>(courseDetail.keySet());
        ArrayList<String> validCourseKeys = new ArrayList<>(this.validCourseDetail.keySet());

        boolean isValid = courseKeys.equals(validCourseKeys);

        if (!isValid) {
            System.out.println("invalid course keys!");
            System.out.println("entered keys : " + courseKeys);
            System.out.println("valid keys : " + validCourseDetail);
        }
    }

    private void checkCourseValue(HashMap<String, String> courseDetail) {
        ArrayList<String> courseKeys = new ArrayList<>(courseDetail.keySet());

        for (String key:courseKeys) {
            if (courseDetail.get(key) == null) {
                System.out.println("'" + key + "'" + " value is must entered.");
            }
        }
    }
}
