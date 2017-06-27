package lesson170624.homework;

import lesson170624.classwork.MathUtils;
import utils.SimpleUnit;

/**
 * Created by kseni on 24.06.2017.
 */
//- sign(int a) - высисление знака числа: -1 если отрицательно, 1 если положительное, 0 если 0
public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(10), 1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(-10), -1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(0), 0));

        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MIN_VALUE), -1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(10), -1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-10), 1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(10), 0));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-10), 0));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(0), -1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(0), 1));

    }
}