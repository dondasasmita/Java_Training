package algorithm;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        } else {
            return 0;
        }
    }

    //check if Array contains a value;
    public boolean doesArrayContainThisValue(int searchValue) {

        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    //deleting an index
    public void deleteValueAtIndex (int index){
        //check if index is less than the Array size
        if (index < arraySize) {
            // populate the array at Index with value from the next index
            for (int i = index; i < (arraySize-1) ; i++) {
                theArray[i] = theArray[i+1];
            }
            //delete the arraysize by 1
            arraySize--;

        }
    }

    //insert a value and increment the arraySize
    public void insertValue(int value){

        if (arraySize < 50) {
            //insert the value to the Array at the last index
            theArray[arraySize] = value;
        }
        arraySize++;

    }

    //search for value in the Array
    public String linearSearchForValue (int value){

        boolean valueInArray = false;
        String indexesWithValue = "";

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value){
                valueInArray = true;
                indexesWithValue += i + " ";
            }
            else if (!valueInArray){
                indexesWithValue = "";
            }
        }
        System.out.println("The value was found in the following : " + indexesWithValue);
        System.out.println();
        return indexesWithValue;
    }

    //print the index and the value in array
    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
            System.out.println("----------");
        }
    }

    //bubble sort puts the biggest value into the last index
    public void bubbleSort(){
        for (int i = arraySize -1 ; i > 1 ; i--) {
            for(int j = 0 ; j < i ; j++){
                if (theArray [j] > theArray [j+1]){
                    swapValues (j, j+1);
                }

            }
        }
    }

    public void swapValues (int indexOne , int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray [indexTwo] = temp;
    }


}
