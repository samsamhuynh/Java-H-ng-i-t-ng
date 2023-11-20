import java.util.Arrays;
import java.util.HashSet;

public class NewTubeSystem {
    public static void main(String[] args) {
        HashSet<String> recommendCourse = new HashSet<>(
                Arrays.asList("111", "222", "333", "444", "555", "666")
        );

        User grace = new User("g@email.com", "111", "grace");
        grace.viewCourse("111");
        grace.viewCourse("222");
        grace.viewCourse("333");
        grace.viewCourse("111");
        grace.viewCourse("333");

        System.out.println(grace.viewHistory);
        HashSet<String> graceViewCourse = HashSet
    }
}
