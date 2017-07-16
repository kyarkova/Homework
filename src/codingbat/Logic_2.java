package codingbat;

/**
 * Created by admin4 on 08.07.2017.
 */
public class Logic_2 {
    public boolean makeBricks(int small, int big, int goal) {
        return goal / 5 <= big ? goal % 5 <= small : goal - 5 * big <= small;

    }

    public int loneSum(int a, int b, int c) {
        return a == b && a == c ? 0 : a == b ? c : b == c ? a : a == c ? b : a + b + c;

    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return a + b + c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        return n >= 13 && n < 15 || n > 16 && n <= 19 ? 0 : n;

    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        return num % 10 >= 5 ? num + 10 - num % 10 : num - num % 10;

    }

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1) {
            if (Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
                return true;
            }
        } else if (Math.abs(a - c) <= 1) {
            if (Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
                return true;
            }
        }
        return false;
    }

    public int blackjack(int a, int b) {


        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        }
        return 21 - a > 21 - b ? b : a;
    }

    public boolean evenlySpaced(int a, int b, int c) {

        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        return c - b == b - a;
    }

    public int makeChocolate(int small, int big, int goal) {
        return (goal / 5 <= big ?
                (goal % 5 <= small ?
                        goal % 5 : -1) : (goal - 5 * big <= small ? goal - 5 * big : -1));
    }
}
