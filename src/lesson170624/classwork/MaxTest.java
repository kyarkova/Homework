package lesson170624.classwork;

/**
 * Created by kseni on 24.06.2017.
 */
public class MaxTest {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 20), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 30), 30));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(20, 10), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(30, 10), 30));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(0, Integer.MAX_VALUE), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(0, Integer.MIN_VALUE), 0));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(30, 10), 10));
        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));


    }


}
