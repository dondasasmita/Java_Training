import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your local hour in 24h format : ");
        int hours = userInput.nextInt();
        System.out.println("Enter the minutes : ");
        int minutes = userInput.nextInt();

        int timeinMST = hours - 14;
        int timeinPST = hours - 15;

        System.out.println("Your local time = " + hours + ":" + minutes);
        System.out.println("Caden's Time = " + timeinMST + ":" + minutes);
        System.out.println("Ryan's Time = " + timeinPST + ":" + minutes);

    }
}
