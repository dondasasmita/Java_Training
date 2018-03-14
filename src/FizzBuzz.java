/*

Return an array containing the numbers from 1 to N, where N is the parametered value. N will never be less than 1 (in C#, N might be less then 1);
Replace certain values however if any of the following conditions are met:
If the value is a multiple of 3: use the value 'Fizz' instead
If the value is a multiple of 5: use the value 'Buzz' instead
If the value is a multiple of 3 & 5: use the value 'FizzBuzz' instead

 */

public class FizzBuzz {

    //an array of int
    int [] array;

    //constructor takes in the number of array
    FizzBuzz (int size){
        array = new int [size];
    }

    //method to populate the array
    void populateArray() {
        for (int i = 0 ; i <= array.length - 1 ; i++) {
            array [i] = i + 1;
        }
    }

    //printFizzBuzz method
    void printFizzBuzz (){

        for (int i = 0 ; i <= array.length - 1 ; i++){
            if (array[i] % 3 == 0) {
                System.out.print("Fizz | ");
            }
            else if (array[i] % 5 == 0) {
                System.out.print("Buzz | ");
            }
            else if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                System.out.print("FizzBuzz | ");
            }
            else System.out.print(array[i] + " | ");
        }

    }

    public static void main(String[] args) {


        FizzBuzz anyArray = new FizzBuzz(19);
        anyArray.populateArray();

        anyArray.printFizzBuzz();


    }


}
