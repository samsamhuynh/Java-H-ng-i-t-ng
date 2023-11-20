import java.util.HashMap;

public class NewTubeSystem {
    public static void main(String[] args) {
        User user = new User("g@email.com", "111", "grace");

        HashMap<String, String> courseInfo = new HashMap<>();
        courseInfo.put("id", "111");
        courseInfo.put("name", "java programing");
        courseInfo.put("level", "introduction");
        courseInfo.put("runtime", "03:00:00");

        user.viewCourse(courseInfo);

        courseInfo = new HashMap<>();
        courseInfo.put("id", "222");
        courseInfo.put("name", "web server");
        courseInfo.put("level", "introduction");
        courseInfo.put("runtime", null);

        user.checkValidCourse(courseInfo);

        courseInfo.put("runtime", "05:00:00");
        user.checkValidCourse(courseInfo);
        user.viewCourse(courseInfo);

        courseInfo = new HashMap<>();
        courseInfo.put("id", "333");
        courseInfo.put("name", "SQL");
        courseInfo.put("level", "Basic");
        courseInfo.put("runtime", "04:00:00");
        courseInfo.put("rating", "5");

        user.checkValidCourse(courseInfo);

        courseInfo.remove("rating");
        user.checkValidCourse(courseInfo);
        user.viewCourse(courseInfo);
    }
}
