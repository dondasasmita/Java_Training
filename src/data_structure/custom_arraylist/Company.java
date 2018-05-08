package data_structure.custom_arraylist;

import java.util.ArrayList;

public class Company {

    String company;
    int arrayLength;
    int startIndex = 0;
    String [] companies;

    //method to add item to the array
    public void addCompany(String company){
        //check if the array needs to be resized
        if (checkArrayForResize(companies)){
            this.companies = resize(companies);
        }
        //add the string to the new array
        for (int i = 0; i < companies.length ; i++) {
            if (companies[i] == null){
                companies[i] = company;
                break;
            } else i++;
        }
    }

    //method to check if array hits the upper bound (at 8)
    public boolean checkArrayForResize(String [] array){
        //integer to store the number of String in the array
        int numString = 0;
        boolean needToResize;
        //go through every word in the array and count
        for(String word : array) {
            numString ++;
        }
        if (numString >= (array.length * 0.75)) {
            needToResize = true;
        } else needToResize = false;
        return needToResize;
    }

    //method to increase the String array size by creating a new array if the method above is true
    public String [] resize(String [] array){
        //crete a new array
        String [] array2 = new String[array.length * 2];
        //copy the values from the first String array to the new one.
        for (int i = 0; i < array.length ; i++) {
                array2[i] = array[i];
            }
        return array2;

        }



}
