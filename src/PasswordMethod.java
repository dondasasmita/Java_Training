import java.util.Scanner;

/**
 Write a Java method to check whether a string is a valid password.
 Password rules:
 A password must have at least ten characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
 */

public class PasswordMethod {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a password :");
        String password = userInput.nextLine();

        for (int i = 0 ; i < password.length() ; i++) {
            char checkCharacters = password.charAt(i);
        }

    }
}
