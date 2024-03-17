import java.util.ArrayList;
import java.util.List;

public class Course {
    static ArrayList<String> courses = new ArrayList<>();
    int num;

    /*public Course (List<String> courses) {
        this.courses = courses;
    }*/
    public void getcourse(String Course) {
        courses.set(num, Course);
        num++;
    }

}
