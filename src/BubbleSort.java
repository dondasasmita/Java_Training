import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {



        int array [] = {23, 1, 7, 31, 19, 83, 86};
        int array01 [] = {23, 1, 7, 31, 19, 83, 86};

        System.out.println("Before Sorting\n");

        // array
        System.out.println("Array 1");
        for (int i : array) {
            System.out.print(i + " | ");
        }
        System.out.println("\n");

        // array01
        System.out.println("Array 2");
        for (int i : array01) {
            System.out.print(i + " | ");
        }

        System.out.println("\n");
        System.out.println("After Sorting Array 1 Using Another Solution\n");

        // After searching Google for other solutions
        int counter = 0;
        long startTime = System.nanoTime();
        for (int i = 0 ; i < array.length - 1 ; i ++) {
            for (int x = 0 ; x < array.length -1 - i ; x ++) {
                if (array [x] > array [x + 1]) {
                    int temporaryBox = array [x];
                    array [x] = array [x + 1];
                    array [x + 1] = temporaryBox;
                }
                counter++;
            }
        }
        System.out.println("How many times it iterates: " + counter);
        System.out.println("Time it takes : " + (System.nanoTime() - startTime));
        for (int i : array) {
            System.out.print(i + " | ");
        }

        System.out.println("\n");
        System.out.println("After Sorting Array 2 Using My Initial Solution\n");

        // The initial solution
        long startTime1 = System.nanoTime();
        int counter1 = 0;
        for (int i = 0 ; i < array01.length - 1 ; i ++) {
            for (int x = i + 1 ; x < array01.length ; x ++) {
                if (array01 [i] > array01 [x]) {
                    int temporaryContainer = array01 [i];
                    array01 [i] = array01 [x];
                    array01 [x] = temporaryContainer;
                }
                counter1++;
            }
        }
        System.out.println(counter1);
        System.out.println("Time it takes : " + (System.nanoTime() - startTime1));

        for (int i : array01) {
            System.out.print(i + " | ");
        }

    }

}
