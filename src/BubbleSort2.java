import java.util.Arrays;
import java.util.Random;

public class BubbleSort2 {

    public static void main(String[] args) {

        int [] randomArray = new int [25];
        Random randomNum = new Random();

        char [] randomChars = new char [26];

        //populating the num array with random numbers
        for (int i = 0 ; i < randomArray.length ; i++){
            randomArray[i] = randomNum.nextInt(500);
        }

        //populating char array with random chars
        for (int i = 0 ; i < randomChars.length ; i++){
            randomChars[i] = (char) (97 + (int)(Math.random() * ((122 - 97) * 1)));
        }

        System.out.println("This is random numbers before BubbleSort ");

        //printing the array
        for(int i = 0 ; i < randomArray.length; i++){
            System.out.print(randomArray[i] + " | ");
        }


        System.out.println("\n" + "This is random chars before BubbleSort");

        //printing the array
        System.out.println(Arrays.toString(randomChars));

        //BubbleSort on randomArray
        for (int i = 0; i < randomArray.length - 1 ; i++) {
            for (int j = 0; j < randomArray.length - i - 1 ; j++) {
                if (randomArray[j] > randomArray [j + 1]) {
                    int tempBox = randomArray [j];
                    randomArray [j] = randomArray [j+1];
                    randomArray [j+1] = tempBox;
                }
            }
        }

        //BubbleSort on randomChars
        for (int i = 0; i < randomChars.length - 1 ; i++) {
            for (int j = 0; j < randomChars.length - i - 1 ; j++) {
                if (randomChars[j] > randomChars [j + 1]) {
                    char tempBox = randomChars [j];
                    randomChars [j] = randomChars [j+1];
                    randomChars [j+1] = tempBox;
                }
            }
        }

        //print out the results
        System.out.println("Random numbers after BubbleSort : ");
        for (int element : randomArray) {
            System.out.print(element + " | ");
        }

        //print out the results
        System.out.println("\n Random chars after BubbleSort : ");
        System.out.println(Arrays.toString(randomChars));




    }
}
