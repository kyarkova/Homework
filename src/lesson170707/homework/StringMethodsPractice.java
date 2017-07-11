package lesson170707.homework;

import utils.SimpleUnit;

/**
 * Created by admin4 on 08.07.2017.
 */
public class StringMethodsPractice {
    public static void main(String[] args) {
        String s = "Hello";  // trimmed
        String s2 = "   Hello ";
        String s3 = "  Hello";
        String s4 = "Hello  ";
        String s5 = "  H e l l o  ";
        String s6 = "";

        System.out.println(SimpleUnit.assertEquals(trim(s), s));
        System.out.println(SimpleUnit.assertEquals(trim(s2), s));
        System.out.println(SimpleUnit.assertEquals(trim(s3), s));
        System.out.println(SimpleUnit.assertEquals(trim(s4), s));
        System.out.println(SimpleUnit.assertEquals(trim(s5), "H e l l o"));
        System.out.println(SimpleUnit.assertEquals(trim(s6), ""));


        System.out.println(SimpleUnit.assertEquals(replace(s, 'H', 'h'), "hello"));
        System.out.println(SimpleUnit.assertEquals(replace(s, 'l', 't'), "Hetto"));
        System.out.println(SimpleUnit.assertEquals(replace(s5, ' ', '/'), "//H/e/l/l/o//"));
        System.out.println(SimpleUnit.assertEquals(replace("", 'l', 't'), ""));
        System.out.println(SimpleUnit.assertEquals(replace("e", 'H', 'g'), "e"));
        System.out.println(SimpleUnit.assertEquals(replace("e", 'e', 'g'), "g"));


    }

    private static String replace(String s, char oldCh, char newCh) {
        if (s.length() == 0) {
            return s;
        }
        if (oldCh == newCh) {
            return s;
        }
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == oldCh) {
                res.append(newCh);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }

    private static String trim(String s) {

        if (s == null || s.length() == 0) {
            return s;
        }

        if (hasNoTrailingOrLeadingSpaces(s)) {
            return s;
        }
        int indexLead = 0;
        int indexTrail = s.length();
        if (s.indexOf(' ') == 0) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    indexLead = i + 1;
                    break;
                }
            }
        }
        if (s.lastIndexOf(' ') == s.length() - 1) {
            for (int i = s.length() - 1; i > 0; i--) {
                if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                    indexTrail = i;
                    break;
                }
            }
        }
        return s.substring(indexLead, indexTrail);

    }

    private static boolean hasNoTrailingOrLeadingSpaces(String s) {
        return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
    }

}
