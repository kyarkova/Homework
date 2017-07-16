package codingbat;

/**
 * Created by kseni on 10.07.2017.
 */
public class String_3 {
    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 1; i <= str.length(); i++) {
            if ((str.charAt(i - 1) == 'y' || str.charAt(i - 1) == 'z') &&
                    (i == str.length() || !Character.isLetter(str.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public String withoutString(String base, String remove) {
        String res = base;
        base = base.toLowerCase();
        remove = remove.toLowerCase();
        int i = base.indexOf(remove);
        while (i != -1) {
            base = base.substring(0, i) + base.substring(i + remove.length());
            res = res.substring(0, i) + res.substring(i + remove.length());
            i = base.indexOf(remove);
        }
        return res;
    }

    public boolean equalIsNot(String str) {
        if (!str.contains("not") && !str.contains("not")) {
            return true;
        }
        if (!str.contains("not") ^ !str.contains("not")) {
            return false;
        }
        int countIs = 0;
        int countNot = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ("is".equals(str.substring(i, i + 2))) {
                countIs++;
            }
            if (i < str.length() - 2 && "not".equals(str.substring(i, i + 3))) {
                countNot++;
            }
        }
        return countIs == countNot;
    }

    public boolean gHappy(String str) {
        if ("g".equals(str)) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i == 0 && str.charAt(i + 1) != 'g') {
                    return false;
                } else if (i == str.length() - 1) {
                    if (str.charAt(i - 1) != 'g') {
                        return false;
                    }
                } else if (str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g') {
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) &&
                    str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }

    public String sameEnds(String string) {
        char[] chars = string.toCharArray();
        for (int i = (string.length() + 1) / 2; i < string.length(); i++) {
            if (chars[i] == chars[0]) {
                if (string.substring(i).equals(string.substring(0, string.length() - i))) {
                    return string.substring(0, string.length() - i);
                }
            }
        }
        return "";
    }

    public String mirrorEnds(String string) {
        String res = "";
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - i - 1)) {
                res += string.charAt(i);
            } else {
                break;
            }
        }
        return res;

    }

    public int sumDigits(String str) {
        int sum = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    public int maxBlock(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int max = 0;
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    count = 1;
                }
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }


    public int sumNumbers(String str) {
        int sum = 0;
        String temp = "";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            while (Character.isDigit(charArray[i])) {
                temp += charArray[i];
                i++;
                if (i == charArray.length) {
                    break;
                }
            }
            if (!temp.isEmpty()) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        String res = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))
                    || i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
                res += str.charAt(i);
            } else if (i + 1 < len && "is".equals(str.substring(i, i + 2))) {
                res += "is not";
                i++;
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }


}
