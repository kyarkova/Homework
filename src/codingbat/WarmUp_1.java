package codingbat;

/**
 * Created by kseni on 24.06.2017.
 */
public class WarmUp_1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday | vacation);
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return a + b;
        }
    }

    public int diff21(int n) {
        if (n <= 21) {
            return Math.abs(21 - n);
        } else {
            return Math.abs(21 - n) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking & (hour < 7 | hour > 20));
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return a < 0 & b < 0;
        } else {
            return a < 0 ^ b < 0;
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        } else {
            return str;
        }
    }

    public String front3(String str) {
        String s;
        if (str.length() >= 3) {
            s = str.substring(0, 3);
        } else {
            s = str;
        }
        return s + s + s;
    }

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        String front;
        if (str.length() > 2) {
            front = str.substring(0, 2);
        } else {
            front = str;
        }
        return front + str + front;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || temp2 < 0 && temp1 > 100;
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) | (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);

    }

    public String delDel(String str) {
        if (str.length() > 3 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {
        String s = "";
        if (str.length() > 0 && str.charAt(0) == 'o') {
            s += "o";
        }
        if (str.length() > 1 && str.charAt(1) == 'z') {
            s += "z";
        }
        return s;
    }

    public int intMax(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public int close10(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) || ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        if (a > b && a >= 10 && a <= 20) {
            return a;
        } else if (b > a && b >= 10 && b <= 20) {
            return b;
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean stringE(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'e') {
                count++;
            }

        }
        return count >= 1 && count <= 3;
    }

    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public String endUp(String str) {
        if (str.length() > 3) {
            return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
        } else {
            return str.toUpperCase();
        }
    }

    public String everyNth(String str, int n) {
        String s = "";
        for (int i = 0; i < str.length(); i += n) {
            s += str.charAt(i);

        }
        return s;
    }
}
