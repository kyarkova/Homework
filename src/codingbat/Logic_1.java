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


}
