import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Account implements AccountManagement {
    public String username;
    // TODO: Passwords should hashed
    public String password;
    private UUID accountID;
    int te;
    int st;
    int as;
    ArrayList<String> usernamesTE = new ArrayList<>();
    ArrayList<String> passwordsTE = new ArrayList<>();
    ArrayList<String> usernamesST = new ArrayList<>();
    ArrayList<String> passwordsST = new ArrayList<>();
    ArrayList<String> usernamesAS = new ArrayList<>();
    ArrayList<String> passwordsAS = new ArrayList<>();

    @Override
    public boolean validatePassword(String enteredPassword) {
        //TODO
        return false;
    }

    @Override
    public void changeUsername(String newUsername) {
        //TODO
        username = newUsername;
    }

    @Override
    public void changePassword(String newPassword) {
        //TODO
        password = newPassword;
    }

    public void getUsername() {
        System.out.println("Username:");
        Scanner scanner = new Scanner(System.in);
        username = scanner.nextLine();
        //usernamesTE[i] = Username;
    }

    public void getPassword() {
        System.out.println("Password:");
        Scanner scanner = new Scanner(System.in);
        password = scanner.next();
        //passwordsTE[i] = Password;
    }

    public void Head() {
        usernamesAS.set(0, "masoom");
        passwordsAS.set(0, "1234");

    }
}
