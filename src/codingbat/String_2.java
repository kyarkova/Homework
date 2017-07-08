package codingbat;

/**
 * Created by admin4 on 08.07.2017.
 */
public class String_2 {
    public String doubleChar(String str) {
        String res = "";
        for (char ch : str.toCharArray()) {
            res = res + ch + ch;
        }
        return res;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        String temp;
        for (int i = 0; i < str.length() - 2; i++) {

            temp = str.substring(i, i + 3);
            if ("cat".equals(temp)) countCat++;
            else if ("dog".equals(temp)) countDog++;
        }
        return countCat == countDog;
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if ("co".equals(str.substring(i, i + 2)) && str.charAt(i + 3) == 'e') {
                count++;
                i += 2;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }

    public boolean xyzThere(String str) {
        boolean res = false;
        for (int i = 0; i <= str.length() - 3; i++) {
            if ((i == 0 && "xyz".equals(str.substring(i, i + 3)))
                    ||
                    ("xyz".equals(str.substring(i, i + 3)) && str.charAt(i - 1) != '.')) {
                res = true;
            }
        }
        return res;
    }

    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        return str.lastIndexOf('x') <= str.lastIndexOf('y');
    }

    public String mixString(String a, String b) {
        String res = "";
        int length;
        if (a.length() < b.length()) {
            length = a.length();
        } else {
            length = b.length();
        }
        for (int i = 0; i < length; i++) {
            res += a.charAt(i);
            res += b.charAt(i);
        }
        if (a.length() < b.length()) {
            res += b.substring(length);
        } else {
            res += a.substring(length);
        }
        return res;
    }

    public String repeatEnd(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            res += str.substring(str.length() - n);
        }
        return res;
    }

    public String repeatFront(String str, int n) {
        String res = "";
        for (int i = n; i >= 0; i--) {
            res += str.substring(0, i);
        }
        return res;
    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        String res = word;
        for (int i = 0; i < count - 1; i++) {
            res += sep;
            res += word;
        }
        return res;
    }

    public boolean prefixAgain(String str, int n) {
        String pref = str.substring(0, n);

        for (int i = n; i < str.length() - n + 1; i++) {
            if (pref.equals(str.substring(i, i + n))) return true;
        }

        return false;
    }

    public boolean xyzMiddle(String str) {
        if (str.length() < 3) return false;

        int index = str.indexOf("xyz");
        if (Math.abs(index - (str.length() - index - 3)) <= 1) return true;
        while (index >= 0) {
            index = str.indexOf("xyz", index + 3);
            if (Math.abs(index - (str.length() - index - 3)) <= 1) return true;

        }
        return false;
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) return "";
        return str.substring(first + 5, last);
    }

    public boolean sameStarChar(String str) {
        int index = str.indexOf('*', 1);
        while (index > 0 && index != str.length() - 1) {
            if (str.charAt(index - 1) != str.charAt(index + 1)) return false;
            index = str.indexOf('*', index + 1);
        }
        return true;
    }

    public String oneTwo(String str) {
        String res = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            res += str.charAt(i + 1);
            res += str.charAt(i + 2);
            res += str.charAt(i);
        }
        return res;
    }

    public String zipZap(String str) {
        if (str.length() < 3) return str;
        String res = "";
        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                res += str.charAt(i);
                res += str.charAt(i + 2);
                i += 2;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }

}
