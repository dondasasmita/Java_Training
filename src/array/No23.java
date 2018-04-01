package array;

public class No23 {

    public static boolean no23 (int [] nums){

        boolean twoOrThreeIsFound = false;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 2 || nums[i] == 3) twoOrThreeIsFound = true;
        }
        return twoOrThreeIsFound;
    }

    public static void main(String[] args) {

        int [] array = {4,5,7,8,9,10};
        System.out.println(no23(array));

    }
}
