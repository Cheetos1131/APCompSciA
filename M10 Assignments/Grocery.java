public class Grocery {
    private String category;
    private int qtyOnHand;
    private double price;

    public Grocery(String i, int k, double j) {
        category = i;
        qtyOnHand = k;
        price = j;
    }

    public String getCategory() {
        return category;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public double getPrice() {
        return price;
    }
}