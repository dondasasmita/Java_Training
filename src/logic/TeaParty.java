package logic;

/*
We are having a party with amounts of tea and candy.
Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
 */


public class TeaParty {

    public static int rateParty(int numOfTea, int numOfCandy){
        if(numOfTea >= numOfCandy * 2 || numOfCandy >= numOfTea * 2){
            return 2;
        } else if (numOfTea >= 5 && numOfCandy >= 5){
            return 1;
        } else return 0;
    }

    public static void main(String[] args) {

        switch (rateParty(12,6)){
            case 2:
                System.out.println("Party is great");
                break;
            case 1:
                System.out.println("Party is good");
                break;
            case 0:
                System.out.println("Party is bad");
        }
    }

}
