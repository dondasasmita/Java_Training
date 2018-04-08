package logic;

public class CaughtSpeeding {

    public static int caughtSpeeding (int speed, boolean isBirthday){

        int ticket = 0;
        int birthday;
        if (isBirthday == true){
            birthday = 1;
        } else birthday = 0;

        switch (birthday) {
            case 0:
                if (speed <= 60){
                    ticket = 0;
                } else if (speed > 60 && speed <= 80) {
                    ticket = 1;
                } else if (speed > 80) {
                    ticket = 2;
                }
                break;
            case 1:
                if (speed <= (60 * 5)) {
                    ticket = 0;
                } else if (speed > (60*5) && speed <= (80*5)) {
                    ticket = 1;
                } else if (speed > (80*5)){
                    ticket = 2;
                }
        }
        return ticket;

    }

    public static void main(String[] args) {

        //not on birthday, expected outcome is 2
        System.out.println(caughtSpeeding(81, false));
        //on birthday, expected outcome is 1
        System.out.println(caughtSpeeding(80 * 5, true));

    }
}
