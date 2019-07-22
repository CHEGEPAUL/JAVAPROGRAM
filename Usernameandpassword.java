import java.util.Scanner;

public class Usernameandpassword{
    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            String username, password;

            System.out.println("Enter your username");
            username = input.nextLine();

            System.out.println("Enter your password");
            password = input.nextLine();

            if (username.equals("CHEGESON") && (password.equals("PAULO"))) {
                System.out.println("Welcome PAUL,So Glad you could join us");
            } else {
                System.out.println("Please try again..This is not your account");
            }
        }

}
