public class Swapper {
    private int a, b;
    public Swapper(int aVal, int bVal) {
        a = aVal;
        b = bVal;
    }
    public void swap() {
        a = b;
        b = a;
    }
    public void test() {
        System.out.println("a= " + a + " b= " + b);
    }
    
}
