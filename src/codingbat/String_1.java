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
        if (str.length() < 2) return str;
        else return str.substring(0, 2);
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


}
