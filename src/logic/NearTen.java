package logic;

/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
example:
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */

public class NearTen {

    public static boolean nearTen(int a , int b) {

        boolean nearTen;

        if ( a % b > 1 && a % b < 11) {
            nearTen = true;
        } else nearTen = false;

        return nearTen;
    }

    public static void main(String[] args) {

        System.out.println(nearTen(10, 2));
        System.out.println(nearTen(14, 3));

    }

}
