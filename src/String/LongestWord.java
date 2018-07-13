package String;

/*
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty.
 */

public class LongestWord {

    public static String longestWord(String sentence) {
        // break sentence into array of words
        String [] words = sentence.split("\\s+");

        //check each index for the longest
        String longestWord = "";
        for (int i = 0; i < words.length ; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }
        // if the longest found, return it
        return longestWord;
    }


    public static void main(String[] args) {

        String sentence = "I am a software developer";

        System.out.println(longestWord(sentence));
    }
}
