public class CounterTester {
    public static void main(String[] args) {
        int t = 0;
        int i;
        Counter c = new Counter(10);
        for ( i = 0 ; i < 5 ; i++ ) {
        c = c.nextCounter();
        t = c.getN();
        }
        System.out.println(t);
    }
}
