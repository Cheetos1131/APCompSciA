/**
 * Purpose: Polymorphism
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
import java.util.ArrayList;
public class CircleTester {
    public static void main(String[] args) {
        ArrayList<Circle2> testArray = new ArrayList<Circle2>();
        testArray.add(new Circle2(2, 4, 16));
        testArray.add(new Cylinder2(2, 4, 16, 8));
        testArray.add(new Oval2(2, 4, 16, 8));
        testArray.add(new OvalCylinder2(2, 4, 16, 8, 4));

        showCenter(testArray);
    }

    public static void showCenter(ArrayList<Circle2> source) {
        for(Circle2 i: source) {
            System.out.println("For this " + i.getName() + " the " + i.getCenter() + ".");
        }
    }
}
