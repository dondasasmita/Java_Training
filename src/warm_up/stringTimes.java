package warm_up;

public class stringTimes {

    public static void stringTimes(String word, int a){
        for (int i = 0; i < a ; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {

        stringTimes("Hi There", 10);
    }
}
