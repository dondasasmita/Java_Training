import java.util.Scanner;

/**
 Write a Java method to check whether a string is a valid password.
 Password rules:
 A password must have at least ten characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
 */

public class PasswordMethod {

    public static boolean specialCharFound;

    public static boolean scanPassword(char [] password) {
        for (int i = 0 ; i < password.length ; i++) {
            if (password [i] == '@' || password [i] == '!' ) {
               specialCharFound = true;
               break;
            }
            else {
                specialCharFound = false;
            }
        }
        return specialCharFound;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a password :");
        String password = userInput.nextLine();

        char [] passwordArray = password.toCharArray();
        scanPassword(passwordArray);

        if (specialCharFound) {
            System.out.println("Special characters found!");
        } else {
            System.out.println("No special characters found!");
        }

    }
}
