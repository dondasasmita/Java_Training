package String;

/*
Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {

    public static void frontTimes(String word, int times) {

        for (int i = 0; i < times ; i++) {
            System.out.print(word.substring(0, 3));
        }

    }

    public static void main(String[] args) {

        frontTimes("Chocolate", 10);

    }
}
