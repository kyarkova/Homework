package codingbat;

/**
 * Created by kseni on 05.07.2017.
 */
public class Logic_1 {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
    }

    public int dateFashion(int you, int date) {
        int res = 1;
        if (you >= 8 || date >= 8) {
            res = 2;
        }
        if (you <= 2 || date <= 2) {
            res = 0;
        }
        return res;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return isSummer ? temp >= 60 && temp <= 100 : temp >= 60 && temp <= 90;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int res = 0;

        if (!isBirthday) {
            if (speed >= 61 && speed <= 80) {
                res = 1;
            } else if (speed <= 61) {
                res = 0;
            } else {
                res = 2;
            }
        } else {
            if (speed >= 66 && speed <= 85) {
                res = 1;
            } else if (speed <= 66) {
                res = 0;
            } else {
                res = 2;
            }
        }
  /*if (!isBirthday && speed >=61 && speed <= 80) res = 1;
  if (isBirthday && speed >=66 && speed <= 85) res = 1;
  if (!isBirthday && speed <=61) res = 0;
  if (isBirthday && speed <=66) res = 0;
  if (!isBirthday && speed >=81) res = 2;
  if (isBirthday && speed >=86) res = 2;
  */
        return res;
    }


    public int sortaSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 19 ? 20 : sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 6 || day == 0) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 6 || day == 0) {
                return "10:00";
            }
        }
        return "7:00";
    }

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (Math.abs(a - b) == 6) {
            return true;
        }
        return false;

    }

    public boolean in1To10(int n, boolean outsideMode) {
        return outsideMode ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10);
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        return n % 3 == 0 ^ n % 5 == 0;
    }

    public boolean less20(int n) {
        return n % 20 == 19 || n % 20 == 18;
    }

    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    public int teenSum(int a, int b) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) ? 19 : a + b;
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMom) {
            return true;
        }
        if (isMorning) {
            return false;
        }
        return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }
        return 1;

    }

    public String fizzString(String str) {
        String res = "";
        if (str.charAt(0) == 'f') {
            res += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            res += "Buzz";
        }

        return "".equals(res) ? str : res;
    }

    public String fizzString2(int n) {
        String res = "";

        if (n % 3 == 0) {
            res += "Fizz";
        }
        if (n % 5 == 0) {
            res += "Buzz";
        }
        return "".equals(res) ? n + "!" : res + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return bOk ? c > b : b > a && c > b;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return equalOk ? a <= b && b <= c : a < b && b < c;
    }

    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(c - b) >= 10;
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        if (noDoubles) {
            if (die1 == die2) {
                if (die1++ == 6) {
                    die1 = 1;
                }
            }
        }
        return die1 + die2;

    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return a < b ? a : b;
        }
        return a > b ? a : b;
    }

    public int redTicket(int a, int b, int c) {
        return (a == b && b == c) ? (a == 2 ? 10 : 5) : (b != a && c != a ? 1 : 0);
    }

    public int greenTicket(int a, int b, int c) {
        //return a==b&&a==c ? 20 : a!=b&&b!=c&&a!=c ? 0 : a==b||a==c||b==c ? 10 : 0;
        return a == b && a == c ? 20 : a == b || a == c || b == c ? 10 : 0;

    }

    public int blueTicket(int a, int b, int c) {
        return a + b == 10 || a + c == 10 || b + c == 10 ? 10 : (a + b) - (b + c) == 10 || (a + b) - (a + c) == 10 ? 5 : 0;
    }

    public boolean shareDigit(int a, int b) {
        return a / 10 == b / 10 || a % 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10;
    }

    public int sumLimit(int a, int b) {
        return ("" + a).length() == ("" + (a + b)).length() ? a + b : a;
    }

}
