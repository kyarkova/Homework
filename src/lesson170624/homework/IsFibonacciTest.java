package lesson170624.homework;
import lesson170624.classwork.MathUtils;
import utils.SimpleUnit;
/**
 * Created by kseni on 26.06.2017.
 */

//- isFibonacci(int a) - если это число из ряда Фибоначчи - вернуть true, иначе false
public class IsFibonacciTest {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(0), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(1), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(55), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(39088169), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(4), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(22), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(-22), false));

        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(Integer.MIN_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isFibonacci(Integer.MAX_VALUE), false));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(0), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(1), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(24157817), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(-42), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isFibonacci(Integer.MAX_VALUE), true));

    }
}
