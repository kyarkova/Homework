package lesson170627;

import utils.SimpleUnit;

/**
 * Created by kseni on 27.06.2017.
 */
public class HomeWorkTest {

    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(HomeWork.toBinaryString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toOctalString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toHexString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(1, 3), "1"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(1, 10), "1"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(1, 8), "1"));

        System.out.println(SimpleUnit.assertEquals(HomeWork.toBinaryString(3598), "111000001110"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toOctalString(3598), "7016"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toHexString(3598), "e0e"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(3598, 2), "111000001110"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(3598, 3), "11221021"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(3598, 8), "7016"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(3598, 16), "e0e"));

        System.out.println(SimpleUnit.assertEquals(HomeWork.toBinaryString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toOctalString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toHexString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(0, 2), "0"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(0, 3), "0"));
         System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(0, 8), "0"));
         System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(0, 16), "0"));

        System.out.println(SimpleUnit.assertEquals(HomeWork.toBinaryString(Integer.MAX_VALUE), "1111111111111111111111111111111"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toOctalString(Integer.MAX_VALUE), "17777777777"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toHexString(Integer.MAX_VALUE), "7fffffff"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MAX_VALUE, 2), "1111111111111111111111111111111"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MAX_VALUE, 3), "12112122212110202101"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MAX_VALUE, 8), "17777777777"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MAX_VALUE, 16), "7fffffff"));

        System.out.println(SimpleUnit.assertEquals(HomeWork.toBinaryString(Integer.MIN_VALUE), "-10000000000000000000000000000000"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toOctalString(Integer.MIN_VALUE), "20000000000"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toHexString(Integer.MIN_VALUE), "80000000"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MIN_VALUE, 2), "-10000000000000000000000000000000"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MIN_VALUE, 3), "-12112122212110202102"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MIN_VALUE, 8), "-20000000000"));
        System.out.println(SimpleUnit.assertEquals(HomeWork.toStringUnivers(Integer.MIN_VALUE, 16), "-80000000"));

        //System.out.println(SimpleUnit.assertNotEquals(HomeWork.toBinaryString(3698), ""));
        //System.out.println(SimpleUnit.assertNotEquals(HomeWork.toOctalString(50), ""));
       // System.out.println(SimpleUnit.assertNotEquals(HomeWork.toHexString(0), ""));
       // System.out.println(SimpleUnit.assertNotEquals(HomeWork.toStringUnivers(5, 4), ""));

    }
}
