/*
    TODO: Import all the classes that you have defined and make use of them to build the program.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Program starts from here
        runMenu();
    }

    public static void runMenu() {
        // TODO: Menu will be shown here...
        System.out.println("What is your title?");
        System.out.println("1-Teacher");
        System.out.println("2-Student");
        System.out.println("3-Assistant");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ( n==1 ) {
            //Teacher teacher = new Teacher();
            //teacher.Menu1();
            while (true) {
                Teacher teacher = new Teacher();
                System.out.println("1-Sign up");
                System.out.println("2-Log in");
                int m = scanner.nextInt();
                if ( m==1 ) {
                    teacher.checkSignupUsername();
                    teacher.SignupPassword();
                    teacher.Menu2();
                    break;
                }
                else if ( m==2 ) {
                teacher.checkLoginUsername();
                teacher.Menu2();
                    break;
                }
                else {
                    System.out.println("Enter correct input");
                }
            }
        }
        if ( n==2 ) {
            while (true) {
                Student student = new Student();
                System.out.println("1-Sign up");
                System.out.println("2-Log in");
                int m = scanner.nextInt();
                if ( m==1 ) {
                    student.checkSignupUsername();
                    student.SignupPassword();
                    break;
                }
                else if ( m==2 ) {
                    student.checkLoginUsername();
                    break;
                }
                else {
                    System.out.println("Enter correct input");
                }
            }
        }
        if ( n==3 ) {
            Assistant assistant = new Assistant();
            assistant.Head();
            assistant.checkUsername();
            assistant.Menu2();
        }
    }
}
