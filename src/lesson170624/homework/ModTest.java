package lesson170624.homework;
import lesson170624.classwork.MathUtils;
import utils.SimpleUnit;
/**
 * Created by kseni on 26.06.2017.
 */

//- mod(int a, int b) - вычисление отстатка от деления нацело, не используя оператор %
public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(10, 5), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-10, 5), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(10, 4), 2));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-10, 4), -2));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(11, -4), 3));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(-11, -4), -3));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(0, -4), 0));

        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(Integer.MIN_VALUE, 5), -3));
        System.out.println(SimpleUnit.assertEquals(MathUtils.mod(Integer.MAX_VALUE, 5), 2));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(10, 5), 1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(-10, 5), 1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.mod(0, 5), 1));
    }
}
