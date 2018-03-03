package Copier;

public class StringConstructor {

    public String stringTimes (String word, int x ) {
        String result = "";
        for (int i = 0 ; i < x ; i++) {
            result = result + word + "\n"; // result equals to previous result (note: without it the program will only print once) + the word
        }
        return result;
    }
}
