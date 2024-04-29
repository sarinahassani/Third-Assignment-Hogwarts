import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Account {

    ArrayList<String> myCourses = new ArrayList<>();

    public void Menu2() {
        System.out.println("1-Enrolling in a new course");
        System.out.println("2-View scores");
        System.out.println("3-View courses");
        System.out.println("4-Grading teachers");
        System.out.println("5-Log out");
        Scanner sccaner = new Scanner(System.in);
        while (true) {
            int n = sccaner.nextInt();
            if ( n==1 ) {
                enrollCourse();
                break;
            }
            else if ( n==2 ) {
                myScore();
                break;
            }
            else if ( n==3 ) {
                myCourses();
                break;
            }
            else if ( n==4 ) {
                scoreTeacher();
                break;
            }
            else if ( n==5 ) {
                break;
            }
            else {
                System.out.println("Enter correct input");
            }
        }
    }

    public void checkSignupUsername() {
        while (true) {
            int check = 0;
            getUsername();
            for (int j = 0; j < usernamesST.size(); j++) {
                if (usernamesST.get(j).equals(username)) {
                    System.out.println("The username is duplicate");
                    System.out.println("Pleas enter another username");
                    check++;
                    break;
                }
            }
            if (check == 0) {
                usernamesST.set(st, username);
                break;
            }
        }
    }
    public void SignupPassword() {
        getPassword();
        passwordsST.set(st, password);
        st++;
        Menu2();
    }
    public void checkLoginUsername() {
        int num=0;
        while (true) {
            getUsername();
            int check = 0;
            for (int j = 0; j < usernamesST.size(); j++) {
                if (usernamesST.get(j).equals(username)) {
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
            if (passwordsST.get(num).equals(password)) {
                break;
            } else{
                System.out.println("The password is incorrect, try again");
            }
        }
    }
    public void enrollCourse() {
        int check=0;
        System.out.println("The list of courses is:");
        for (int i=0; i<Course.courses.size(); i++) {
            System.out.println(Course.courses.get(i));
        }
        System.out.println("Enter the name of the course you want to enroll in");
        Scanner scanner = new Scanner(System.in);
        String coursename = scanner.nextLine();
        for (int i=0; i<myCourses.size(); i++) {
            if (myCourses.get(i).equals(coursename)) {
                check++;
                System.out.println("You have already enrolled for this course");
                System.out.println("What else do you want?");
                Menu2();
            }
        }
        if ( check==0 ) {
            System.out.println("Your enrolling was successful");
            System.out.println("What else do you want?");
            myCourses.add(coursename);
            Menu2();
        }
    }
    public void myScore() {
    }
    public void myCourses () {
        System.out.println("The list of your courses is;");
        for (int i=0; i<myCourses.size(); i++) {
            System.out.println(myCourses.get(i));
        }
        System.out.println("What else do you want?");
        Menu2();
    }
    public void scoreTeacher() {
    }
}
