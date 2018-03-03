import java.util.Scanner;

/**
 * A program to get a number from the user and print whether it is positive or negative.
 */


public class PositiveOrNegative {

        public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter any positive or negative number : ");
            int number = userInput.nextInt();

            if (number >= 0) {
                System.out.println("It is a positive number.");
            }
            else {
                System.out.println("It is a negative number.");
            }
        }
}
