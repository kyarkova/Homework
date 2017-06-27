package lesson170624.homework;
import lesson170624.classwork.MathUtils;
import lesson170624.classwork.SimpleUnit;
/**
 * Created by kseni on 26.06.2017.
 */
//- isPrime(int a) - если число простое, вернуть true, иначе false
public class IsPrimeTest {
    public static void main(String[] args) {

        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(3), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(313), true));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(0), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(1), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(169), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(22), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(-22), false));

        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(Integer.MIN_VALUE), false));
        System.out.println(SimpleUnit.assertEquals(MathUtils.isPrime(Integer.MAX_VALUE), false));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(3), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(313), false));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(0), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(1), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(4), true));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.isPrime(-22), true));




    }
}
