package CodingBat;

/**
 * Created by kseni on 24.06.2017.
 */
public class warmUp_2 {
    public String stringTimes(String str, int n) {
        String res = "";
        while (n > 0) {
            res += str;
            n--;
        }
        return res;
    }

    public String frontTimes(String str, int n) {
        if (str.length() >= 3) str = str.substring(0, 3);
        String res = "";
        while (n > 0) {
            res += str;
            n--;
        }
        return res;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') count++;
        }
        return count;
    }

    boolean doubleX(String str) {
        int index = str.indexOf('x');
        if (index == -1) return false;
        if (index == str.length() - 1) return false;
        if (str.charAt(index + 1) == 'x') return true;
        else return false;
    }

    public String stringBits(String str) {
        String res = "";
        for (int i = 0; i <= str.length() - 1; i += 2) {
            res += str.charAt(i);
        }
        return res;
    }

    public String stringSplosion(String str) {
        String res = "";
        for(int i = 1; i<str.length()+1; i++)
            res += str.substring(0, i);
        return res;

    }


    /////////////////////////
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i: nums) if(i==9)count++;
        return count;
    }

    public boolean arrayFront9(int[] nums) {

        for(int i = 0; i<nums.length&&i<4; i++)
            if(nums[i]==9)return true;;
        return false;
    }







}
