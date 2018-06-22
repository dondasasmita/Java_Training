package array;

/*
Sample Output:

================================
java           100
cpp            065
python         050
================================

 */

import java.util.Scanner;

public class FormatPrint {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            // -15 is the space between the words
            if (x >= 100){
                System.out.printf("%-15s%d%n",s1,x);
            } else {
                //adding 0 if input is less than 3 digits
                String formatted = String.format("%03d", x);
                System.out.printf("%-15s%s%n",s1,formatted);
            }

        }
        System.out.println("================================");

    }

}
