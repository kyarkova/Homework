package lesson170712;

import utils.SimpleUnit;

/**
 * Created by kseni on 16.07.2017.
 */
public class StringStackTest {


    public static void main(String[] args) {

        StringStack stack = new StringStack();

        System.out.println(SimpleUnit.assertEquals(stack.size(), 0));
        System.out.println(SimpleUnit.assertNotEquals(stack.size(), 1));
        //  System.out.println(SimpleUnit.assertEquals(stack.tos(), null));

        System.out.println(SimpleUnit.assertEquals(stack.push("one"), true));
        System.out.println(SimpleUnit.assertEquals(stack.tos(), "one"));
        System.out.println(SimpleUnit.assertNotEquals(stack.push("two"), false));
        System.out.println(SimpleUnit.assertEquals(stack.size(), 2));
        System.out.println(SimpleUnit.assertEquals(stack.tos(), "two"));
        System.out.println(SimpleUnit.assertEquals(stack.push("three"), true));
        System.out.println(SimpleUnit.assertEquals(stack.size(), 3));
        System.out.println(SimpleUnit.assertEquals(stack.tos(), "three"));
        System.out.println(SimpleUnit.assertNotEquals(stack.tos(), "one"));
        System.out.println(SimpleUnit.assertEquals(stack.push("four"), false));
        System.out.println(SimpleUnit.assertEquals(stack.size(), 3));
        System.out.println(SimpleUnit.assertNotEquals(stack.tos(), "four"));

        System.out.println(SimpleUnit.assertEquals(stack.pop(), "three"));
        System.out.println(SimpleUnit.assertNotEquals(stack.pop(), "one"));
        System.out.println(SimpleUnit.assertEquals(stack.push("two"), true));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "two"));
        System.out.println(SimpleUnit.assertEquals(stack.pop(), "one"));
        //      System.out.println(SimpleUnit.assertEquals(stack.pop(), null));

        System.out.println(SimpleUnit.assertEquals(stack.size(), 0));


        StringStack stack1 = new StringStack(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(SimpleUnit.assertEquals(stack1.push("" + i), true));
            System.out.println(SimpleUnit.assertNotEquals(stack1.tos(), ""));
        }
        System.out.println(SimpleUnit.assertEquals(stack1.size(), 10));
        for (int i = 10; i < 0; i--) {
            System.out.println(SimpleUnit.assertEquals(stack1.pop(), "" + i));
            System.out.println(SimpleUnit.assertEquals(stack1.tos(), "" + (i + 1)));
        }


    }
}
