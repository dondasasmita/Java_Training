/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 */


public class doubleXX {


    public static void main(String[] args) {

        String newstring = "Baxxli";
        char [] letters = newstring.toCharArray();

        for (int i = 0 ; i <= letters.length - 1; i++) {
            if (letters[i] == 'x') {
                System.out.println("X is found at index " + i);
            }
            else if (letters[i] != 'x') {
                System.out.println("X not found!");
            }
        }
    }
}
