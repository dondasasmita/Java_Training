package array;

/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

 */
public class Front11 {

    public static int[] front11 (int [] a, int [] b){
        int [] c = new int [2];
        c[0] = a[0];
        c[1] = b[0];
        return c;
    }

    public static void main(String[] args) {

        int [] array1 = {15,1,7,8};
        int [] array2 = {31,7,1,81};

        for (int num : front11(array1,array2)) {
            System.out.print(num + " , ");
        }

    }
}
