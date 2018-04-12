package algorithm;

public class Controller {

    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();

        newArray.printArray();

//        newArray.bubbleSort();

        newArray.selectionSort();

        newArray.printArray();

        newArray.binarySearchForValue(19);


    }





}
