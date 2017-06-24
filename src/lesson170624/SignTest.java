package lesson170624;

/**
 * Created by kseni on 24.06.2017.
 */
public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(10), 1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(-10), -1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(0), 0));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MIN_VALUE), -1));
        System.out.println(SimpleUnit.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(10), -1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(-10), 1));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.sign(0), -1));

    }
}