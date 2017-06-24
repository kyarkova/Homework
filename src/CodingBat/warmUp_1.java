package CodingBat;

/**
 * Created by kseni on 24.06.2017.
 */
public class warmUp_1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday|vacation) return true;
        else return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == bSmile) return true;
        else return false;
    }


    public int sumDouble(int a, int b) {
        if (a==b) return 2* (a+b);
        else return a+b;
    }

    public int diff21(int n) {
        if (n <= 21) return Math.abs(21-n);
        else return Math.abs(21-n)*2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking & (hour < 7 | hour > 20)) return true;
        else return false;
    }


}
