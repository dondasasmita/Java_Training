public class SortExercise {

    public static void main(String[] args) {

        String alphabet [] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


        System.out.println("Ascending");

        for (int i = 0 ; i < alphabet.length ; i++){
            System.out.print(alphabet[i].toUpperCase());
        }
        System.out.println();

        System.out.println("Descending");

        for (int x = 0 ; x < alphabet.length/2 ; x++){
            String  temp = alphabet [x];
            alphabet [x] = alphabet [alphabet.length - 1 - x];
            alphabet [alphabet.length - 1 - x] = temp;
        }

        for (int i = 0 ; i < alphabet.length ; i++) {
            System.out.print(alphabet[i].toUpperCase());
        }
    }
}
