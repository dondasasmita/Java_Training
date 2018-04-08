package logic;

/*
When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.
 */

public class CigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend){

        boolean isSuccessful;
        int lowerBound = 40;
        int upperBound = 60;

        if (isWeekend == false && (cigars >= lowerBound && cigars <= upperBound)){
                isSuccessful = true;
        } else if (isWeekend == true && cigars >= lowerBound) {
            isSuccessful = true;
        } else isSuccessful = false;

        return isSuccessful;
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(59, false));
        System.out.println(cigarParty(80,true));
        System.out.println(cigarParty(39,false));
        System.out.println(cigarParty(80,false));
    }

}
