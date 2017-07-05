package codingbat;

/**
 * Created by kseni on 29.06.2017.
 */
public class String_1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String s = str.substring(str.length() - 2);
        return s + s + s;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        return a.length() > b.length() ? b + a + b : a + b + a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1, a.length()) + b.substring(1, b.length());
    }

    public String left2(String str) {
        return str.substring(2, str.length()) + str.substring(0, 2);
    }

    public String right2(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        return front ? "" + str.charAt(0) : "" + str.charAt(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if (str.length() < 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }

    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index <= 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.length() == 3) {
            return "bad".equals(str.substring(0, 3));
        } else {
            return "bad".equals(str.substring(0, 3)) || "bad".equals(str.substring(1, 4));
        }
    }

    public String atFirst(String str) {
        String res = "";
        if (str.length() == 0) {
            res = "@@";
        } else if (str.length() == 1) {
            res = str + "@";
        } else {
            res = str.substring(0, 2);
        }

        return res;
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        if (a.length() == 0) {
            return "@" + b.substring(b.length() - 1);
        }
        if (b.length() == 0) {
            return a.substring(0, 1) + "@";
        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (b.length() == 0) {
            return a;
        }
        if (a.endsWith("" + b.charAt(0))) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, str.length() - 2) +
                str.charAt(str.length() - 1) +
                str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.length() > 2 && "red".equals(str.substring(0, 3))) {
            return "red";
        }
        if (str.length() > 3 && "blue".equals(str.substring(0, 4))) {
            return "blue";
        }
        return "";
    }

    public boolean frontAgain(String str) {
        return str.length() > 1 && str.endsWith(str.substring(0, 2));
    }

    public String minCat(String a, String b) {
        return a.length() > b.length() ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
    }

    public String extraFront(String str) {
        String res = "";
        if (str.length() < 2) {
            res = str;
        } else {
            res = str.substring(0, 2);
        }
        return res + res + res;
    }

    public String without2(String str) {
        String res = "";
        if (str.length() < 2) {
            res = str;
        } else if (str.endsWith(str.substring(0, 2))) {
            res = str.substring(2);
        } else {
            res = str;
        }
        return res;

    }

    public String deFront(String str) {
        String res = "";
        if (str.length() == 0) {
            res = str;
        } else if (str.charAt(0) == 'a') {
            res += 'a';
        }
        if (str.length() > 1 && str.charAt(1) == 'b') {
            res += 'b';
        }
        if (str.length() > 2) {
            res += str.substring(2);
        }
        return res;
    }

    public String startWord(String str, String word) {
        String res = "";
        if (word.length() > str.length()) {
            return "";
        }
        if (word.length() == 1) {
            res += str.charAt(0);
        } else if (word.substring(1, word.length()).equals(str.substring(1, word.length()))) {
            res = str.substring(0, word.length());
        }

        return res;
    }

    public String withoutX(String str) {

        String res = str;
        if (str.length() > 0 && str.charAt(0) == 'x') {
            res = str.substring(1);
        }
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }

    public String withoutX2(String str) {
        if (str.length() < 2) {
            return "";
        }
        String res = str.substring(2);
        if (str.charAt(1) != 'x') {
            res = str.charAt(1) + res;
        }
        if (str.charAt(0) != 'x') {
            res = str.charAt(0) + res;
        }
        return res;
    }
}
