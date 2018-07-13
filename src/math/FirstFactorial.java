package math;

/*
Using the Java language, have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it
(e.g. if num = 4, return (4 * 3 * 2 * 1)). For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 */

public class FirstFactorial {

    public static int factorial (int num) {
        int multiplier = num - 1;
        int result = num;
        for (int i = multiplier; multiplier > 0  ; i--) {
            result = result * multiplier;
            multiplier --;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(factorial(8));

    }
}
