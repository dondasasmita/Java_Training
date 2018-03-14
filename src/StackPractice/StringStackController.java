package StackPractice;

public class StringStackController {

    public static void main(String[] args) {

        StringStack stackOfWords = new StringStack(5);

        stackOfWords.push("Bali");
        stackOfWords.push("Jakarta");
        stackOfWords.push("Lombok");
        stackOfWords.push("Bandung");
        stackOfWords.push("Surabaya");

        stackOfWords.displayAtIndex(0);
        stackOfWords.pop();
        //expected answer is 3
        stackOfWords.displayAtIndex(4);

    }
}
