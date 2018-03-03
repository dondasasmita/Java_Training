import java.util.Scanner;

/**
 Write a Java method to find the smallest number among three numbers.
 */

public class SmallestNumber {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int [] numbers = new int [3];
        int smallest = numbers [0];

        // populate numbers array.
        for (int i = 0 ; i < numbers.length; i ++){
            System.out.print("Enter a number :");
            numbers[i] = userInput.nextInt();
        }
        for (int i : numbers){
            System.out.println("Your number : " + i);
        }

        //find the smallest number

    }
}
