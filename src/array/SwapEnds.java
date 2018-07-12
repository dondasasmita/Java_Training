package array;

public class SwapEnds {

    public int[] swapEnds (int [] array) {
        int temp = array[0];
        array[0] = array[array.length -1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {

        int numbers[] = {10, 2, 3, 5};

        SwapEnds object = new SwapEnds();

        object.swapEnds(numbers);
        for (int num: numbers) {
            System.out.print(num);
        };
    }
}


