import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Grocery[] theGroceries = {
            new Grocery("cereal", 2,4.99),
            new Grocery("milk", 1, 3.69),
            new Grocery("bread", 5, 5.19),
            new Grocery("cereal", 3, 3.59),
            new Grocery("bread", 1, 3.79),
            new Grocery("milk", 2, 3.19)};
        ArrayList<Grocery> test = new ArrayList<Grocery>();
        test = Shopping.addGroc(theGroceries);
        for(Grocery i: test) {
            System.out.println(i.getCategory() + " " + i.getQtyOnHand() + " " + i.getPrice());
        }
        int test2 = Shopping.totalQty(test, "cereal");
        System.out.println(test2);
    }
}