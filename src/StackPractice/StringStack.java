package StackPractice;

import java.util.Arrays;

public class StringStack {

    //create an Array
    private String [] array;

    //create int size for the stack
    private int stackSize;

    //set the stack (array index below 0) as empty
    public int topOfStack = -1;

    //create a constructor String that takes in int size
    StringStack (int size) {
        this.stackSize = size;
        array = new String [size];
        Arrays.fill(array, "- - ");
    }

    //create push method to add element to the stack
    public void push(String insertWord){
        if (topOfStack + 1 < stackSize) {
            topOfStack ++;
            array[topOfStack] = insertWord;
        }
    }

    //create pop method
    public String pop(){
        return array[topOfStack--];
    }

    //create display method
    public void displayAtIndex(int index){
        if (index <= topOfStack) {
            System.out.println(array[index]);
        }
        else {
            System.out.println("You have gone over the stack, top of stack now is at index " + topOfStack);

        }
    }


}
