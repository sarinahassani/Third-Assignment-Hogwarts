import java.util.ArrayList;
import java.util.Scanner;

public class Assistant extends Account {

    ArrayList<String> AllCourses = new ArrayList<>();
    int num;

    /*public void Menu1() {
        checkUsername();
    }*/
    public void Menu2() {
        System.out.println("1-Creat new course");
        System.out.println("2-View the list of courses and students");
        System.out.println("3-Remove Teacher");
        System.out.println("4-Remove Student");
        System.out.println("5-Log out");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if ( n==1 ) {
                creatCourse();
                break;
            }
            else if ( n==2 ) {
                CourseswhitStudents();
                break;
            }
            else if ( n==3 ) {
                RemoveTeacher();
                break;
            }
            else if ( n==4 ) {
                RemoveStudent();
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

    public void checkUsername() {
        int num=0;
        while (true) {
            getUsername();
            int check = 0;
            for (int j = 0; j < usernamesAS.size(); j++) {
                if (usernamesAS.get(j).equals(username)) {
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
            if (passwordsAS.get(num).equals(password)) {
                break;
            } else{
                System.out.println("The password is incorrect, try again");
            }
        }
    }
    public void newAccount() {
        while (true) {
            int check = 0;
            getUsername();
            for (int j = 0; j < usernamesAS.size(); j++) {
                if (usernamesAS.get(j).equals(username)) {
                    System.out.println("The username is duplicate");
                    System.out.println("Pleas enter another username");
                    check++;
                    break;
                }
            }
            if (check == 0) {
                usernamesAS.set(as, username);
                break;
            }
        }
        getPassword();
        passwordsAS.set(as, password);
        as++;
    }
    public void creatCourse() {
        System.out.println("Enter new course name" );
        Scanner scanner = new Scanner(System.in);
        String newcourse = scanner.nextLine();
        int check=0;
        for (int i=0; i<AllCourses.size(); i++) {
            if (AllCourses.get(i).equals(newcourse)) {
                check++;
                System.out.println("This course has already been created");
                System.out.println("  ");
                Menu2();
                break;
            }
        }
        if ( check==0 ) {
            System.out.println("The new course was successfully created");
            System.out.println("  ");
            AllCourses.set(num, newcourse);
            num++;
            Course course = new Course();
            course.getcourse(newcourse);
            Menu2();
        }
    }
    public void CourseswhitStudents() {
    }
    public void RemoveTeacher() {
    }
    public void RemoveStudent() {
    }
}
