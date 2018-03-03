import java.util.Scanner;

/**
 * A program that reads an integer between 0 and 1000 and adds all the digits in the integer.
 */

public class AddDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number from 0 to 1000 ");
        int numberFromUser = input.nextInt();

        int firstDigit = numberFromUser % 10;
        int remainingNumber = numberFromUser / 10;
        int secondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;

        System.out.println(firstDigit + secondDigit + thirdDigit);
    }
}
