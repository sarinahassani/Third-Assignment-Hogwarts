import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Account {

    ArrayList<String> myCourses = new ArrayList<>();

    public void Menu2 () {
        System.out.println("1-Taking a new course");
        System.out.println("2-Grading students");
        System.out.println("3-View the list of courses");
        System.out.println("4-View the list of students");
        System.out.println("5-View my evaluation");
        System.out.println("6-Log out");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 1) {
                TakeCourse();
                break;
            } else if (n == 2) {
                ScoreStudent();
                break;
            } else if (n == 3) {
                MyCourses();
                break;
            } else if (n == 4) {
                MyCourseswhitStudents();
                break;
            } else if (n == 5) {
                MyScors();
                break;
            }
            else if ( n==6 ) {
                break;
            }else {
                System.out.println("Enter correct input");
            }
        }
    }

    public void checkSignupUsername() {
        while (true) {
            int check = 0;
            getUsername();
            for (int j = 0; j < usernamesTE.size(); j++) {
                if (usernamesTE.get(j).equals(username)) {
                    System.out.println("The username is duplicate");
                    System.out.println("Pleas enter another username");
                    check++;
                    break;
                }
            }
            if (check == 0) {
                usernamesTE.set(te, username);
                break;
            }
        }
    }

    public void SignupPassword() {
        getPassword();
        passwordsTE.set(te, password);
        te++;
        Menu2();
    }

    public void checkLoginUsername() {
        int num=0;
        while (true) {
            getUsername();
            int check = 0;
            for (int j = 0; j < usernamesTE.size(); j++) {
                if (usernamesTE.get(j).equals(username)) {
                    check++;
                    num = j;
                    break;
                }
            }
            if (check == 0) {
                System.out.println("Username not found, try again");
            } else if (check != 0) {
                break;
            }
        }
        while (true) {
            getPassword();
            if (passwordsTE.get(num).equals(password)) {
                Menu2();
                break;
            } else{
                System.out.println("The password is incorrect, try again");
            }
        }
    }
    public void TakeCourse() {
            int check=0;
            System.out.println("The list of courses is:");
            for (int i=0; i<Course.courses.size(); i++) {
                System.out.println(Course.courses.get(i));
            }
            System.out.println("Enter the name of the course you want to take it");
            Scanner scanner = new Scanner(System.in);
            String coursename = scanner.nextLine();
            for (int i=0; i<myCourses.size(); i++) {
                if (myCourses.get(i).equals(coursename)) {
                    check++;
                    System.out.println("You have already taked this course");
                    System.out.println("What else do you want?");
                    Menu2();
                }
            }
            if ( check==0 ) {
                System.out.println("Your taking course was successful");
                System.out.println("What else do you want?");
                myCourses.add(coursename);
                Menu2();
            }
    }
    public void ScoreStudent() {
    }
    public void MyCourses() {
            System.out.println("The list of your courses is;");
            for (int i=0; i<myCourses.size(); i++) {
                System.out.println(myCourses.get(i));
            }
            System.out.println("What else do you want?");
            Menu2();
    }
    public void MyCourseswhitStudents() {
    }
    public void MyScors() {
    }
}
