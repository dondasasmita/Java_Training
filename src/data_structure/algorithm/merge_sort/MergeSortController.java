package algorithm.merge_sort;

public class MergeSortController {

    public static void main(String[] args) {

        double randomNumArray[] = new double[30];
        for (int i = 0; i < randomNumArray.length ; i++) {
            randomNumArray[i] = Math.random() * 50 +1;
        }

        for(double num : randomNumArray){
            System.out.print(num + " | ");
        }

        System.out.println("\n AFTER SORT : ");

        MergeSort object = new MergeSort();
        object.sort(randomNumArray,0,randomNumArray.length-1);

        for (double num : randomNumArray){
            System.out.print(num + " | ");
        }

    }
}
