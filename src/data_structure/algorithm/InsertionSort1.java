package algorithm;

import java.util.ArrayList;

//to make insertionSort work with generic data types.
//how to get the comparison between two generic data type

public abstract class InsertionSort1 <E> implements Comparable<E> {

//    ArrayList<E> array;
//
//    public void insertSort(array) {
//
//        for (int i = 1; i < array.size(); i++) {
//
//            E key = array.get(i);
//
//            int indexToCompare = i - 1;
//
//            array.sort();
//
//            while (indexToCompare >= 0 && array.get(indexToCompare) > key) {
//                array.get(indexToCompare) = array.get(indexToCompare);
//                indexToCompare -= 1;
//            }
//            array.get(indexToCompare) = key;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<Double> array = new ArrayList<>();
//        array.add(0, 1.10);
//        array.add(1, 3.30);
//        array.add(2, 4.40);
//        array.add(3, 2.20);
//        array.add(4, 5.50);
//
//        InsertionSort1 insertionSort1 = new InsertionSort1();
//
//        insertionSort1.insertSort(array);
//
//    }
}
