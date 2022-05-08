public class Store {
    private String name;
    private int prodNumb;
    private double price;
    private int quantity;
    public Store(String name, int prodNumb, double price, int quantity) {
        this.name = name;
        this.prodNumb = prodNumb;
        this.price = price;
        this.quantity = quantity;
    }
    //need a toString method
    public void setName(String name) {
        this.name = name;
    }
    public void setProdNumb(int prodNumb) {
        this.prodNumb = prodNumb;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getName() {
        return this.name;
    }
    public int getProdNumb() {
        return this.prodNumb;
    }
    public double getPrice() {
        return this.price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public String toString() {
        return String.format("           %-15s     |     %4d     |     %-7.2f   |      %-3d     ", getName(), getProdNumb(), getPrice(), getQuantity());
    }
}