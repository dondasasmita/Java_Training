package logic;

/*
Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
In all other cases, return the string unchanged. (See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"

 */

public class FizzString {

    public static void checkFizzBuzz(String word){
        if (word.startsWith("f") || word.startsWith("F")){
            System.out.println("Fizz");
        } else if (word.endsWith("b") || word.endsWith("B")){
            System.out.println("Buzz");
        } else if ((word.startsWith("f") || word.startsWith("F")) && (word.endsWith("b") || word.endsWith("B"))){
            System.out.println("FizzBuzz");
        } else {
            System.out.println("No Fizz Nor Buzz");
        }
    }

    public static void main(String[] args) {

        String word = "fig";
        String word2 = "dib";
        String word3 = "fib";
        String word4 = "Starbucks";

        checkFizzBuzz(word);
        checkFizzBuzz(word2);
        checkFizzBuzz(word3);
        checkFizzBuzz(word4);
    }
}
