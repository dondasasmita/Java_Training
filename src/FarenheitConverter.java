import java.util.Scanner;

/**
 * A program to convert temperature from Fahrenheit to Celsius degree
 */


public class FarenheitConverter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter temperature in fahrenheit : ");
        double fahrenheit = userInput.nextInt();
        double celcius = fahrenheit - 17.2222;

        System.out.println(fahrenheit + " degrees is equivalent to " + celcius + " degree celcius");
    }
}
