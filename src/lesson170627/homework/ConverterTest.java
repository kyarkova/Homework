package lesson170627.homework;

import utils.SimpleUnit;

/**
 * Created by kseni on 27.06.2017.
 */
public class ConverterTest {

    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(1), "1"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(1, 3), "1"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(1, 10), "1"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(1, 8), "1"));

        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(3598), "111000001110"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(3598), "7016"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(3598), "e0e"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(3598, 2), "111000001110"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(3598, 3), "11221021"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(3598, 8), "7016"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(3598, 16), "e0e"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(3598, 36), "2ry"));


        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(-3598), "-111000001110"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(-3598), "-7016"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(-3598), "-e0e"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-3598, 2), "-111000001110"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-3598, 3), "-11221021"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-3598, 8), "-7016"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-3598, 16), "-e0e"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-3598, 36), "-2ry"));

        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(0), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(0, 2), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(0, 3), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(0, 8), "0"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(0, 16), "0"));

        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(Integer.MAX_VALUE), "1111111111111111111111111111111"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(Integer.MAX_VALUE), "17777777777"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(Integer.MAX_VALUE), "7fffffff"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MAX_VALUE, 2), "1111111111111111111111111111111"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MAX_VALUE, 3), "12112122212110202101"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MAX_VALUE, 8), "17777777777"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MAX_VALUE, 16), "7fffffff"));

        System.out.println(SimpleUnit.assertEquals(Converter.toBinaryString(Integer.MIN_VALUE), "-10000000000000000000000000000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toOctalString(Integer.MIN_VALUE), "-20000000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toHexString(Integer.MIN_VALUE), "-80000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MIN_VALUE, 2), "-10000000000000000000000000000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MIN_VALUE, 3), "-12112122212110202102"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MIN_VALUE, 8), "-20000000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(Integer.MIN_VALUE, 16), "-80000000"));

        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-79, 2), "-1001111"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-100500, 2), "-11000100010010100"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-23659875, 2), "-1011010010000010101100011"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-569856, 2), "-10001011001000000000"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(-2, 2), "-2"));
        System.out.println(SimpleUnit.assertEquals(Converter.toStringUnivers(5, 37), "Error! Введите основание системы исчисления от 2 до 35!"));


        System.out.println(SimpleUnit.assertNotEquals(Converter.toBinaryString(Integer.MIN_VALUE), "-2147483648"));
        System.out.println(SimpleUnit.assertNotEquals(Converter.toOctalString(Integer.MAX_VALUE), "2147483647"));
        System.out.println(SimpleUnit.assertNotEquals(Converter.toHexString(-3598), "e0e"));
        System.out.println(SimpleUnit.assertNotEquals(Converter.toStringUnivers(5, -4), "11"));
        System.out.println(SimpleUnit.assertNotEquals(Converter.toStringUnivers(5, 37), "11"));

    }
}
