package lesson170624;

/**
 * Created by kseni on 24.06.2017.
 */
public class MaxTest {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 20), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(10, 30), 30));

        System.out.println(SimpleUnit.assertEquals(MathUtils.max(20, 10), 20));
        System.out.println(SimpleUnit.assertEquals(MathUtils.max(30, 10), 30));

        System.out.println(SimpleUnit.assertNotEquals(MathUtils.max(30, 10), 10));








    }


}
