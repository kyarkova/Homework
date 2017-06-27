package codingbat;

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
        if (index == -1) {
            return false;
        }
        if (index == str.length() - 1) {
            return false;
        }
        if (str.charAt(index + 1) == 'x') {
            return true;
        } else {
            return false;
        }
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
        for (int i = 1; i < str.length() + 1; i++) {
            res += str.substring(0, i);
        }
        return res;

    }

    public int last2(String str) {
        if (str.length() <= 2) return 0;
        int count = 0;
        String templ = "" + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(templ)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (i == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length && i < 4; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1) {
                if (nums[i + 1] == 2 & nums[i + 2] == 3)
                    return true;
            }
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length() - 1 & i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() < 2) return str;
        String res = "" + str.charAt(0);
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                res += str.charAt(i);
            }
        }
        res += str.charAt(str.length() - 1);
        return res;
    }

    public String altPairs(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i += 4) {
            s += str.charAt(i);
            if (i + 1 < str.length()) {
                s += str.charAt(i + 1);
            }
        }
        return s;
    }

    public String stringYak(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("yak")) {
                i += 2;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }


}
