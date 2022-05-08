import java.util.ArrayList;
public class Shopping {
    public static final int REORDER = 4;

    public static ArrayList<Grocery> addGroc(Grocery[] groc) {
        ArrayList<Grocery> shoppingList = new ArrayList<Grocery>();
        for(Grocery i: groc) {
            if(i.getQtyOnHand() < REORDER) {
                shoppingList.add(i);
            }
        }
        return shoppingList;
    }

    public static int totalQty(ArrayList<Grocery> shoppingList, String c) {
        int itemTotal = 0;
        for(Grocery k: shoppingList) {
            if(k.getCategory().compareTo(c) == 0) {
                itemTotal += k.getQtyOnHand();
            }
        }
        return itemTotal;
    }
}