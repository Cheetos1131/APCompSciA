import java.util.ArrayList;
/**
 * Purpose: Overriding
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
public class ShapesTester {
    public static void main(String []args) {
        ArrayList<Rectangle4> test = new ArrayList<Rectangle4>();
        test.add(new Box4(4, 4, 4));
        test.add(new Rectangle4(12, 20));
        test.add(new Cube4(4));
        test.add(new Parallelogram(4, 6));
        test.add(new Trapazoid(4, 6));

        for(Rectangle4 i: test) {
            showEffectBoth(i);
        }

        System.out.println();
        System.out.println("Test for equality");
        System.out.println();
        equalityTest(test.get(0), test.get(1));
        System.out.println();
        equalityTest(test.get(0), test.get(2));
    }

    public static void equalityTest(Rectangle4 item1, Rectangle4 item2) {
        if(item1.getLength() == item2.getLength()) {
            if(item1.getWidth() == item2.getWidth()) {
                System.out.println(item1 + " is the same size as " + item2);
            }
        }
        else {
            System.out.println(item1 + " is not the same size as " + item2);
        }
    }

    public static void showEffectBoth(Rectangle4 r) {
        System.out.println(r);
    }
}