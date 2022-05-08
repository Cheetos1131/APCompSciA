public class SomeClass {
    private int number1;
    private double number2;
    private static final int SECONDSINMINUTE = 60;

    public SomeClass() {

    }

    public SomeClass(int n) {
        number1 = n;
    }

    public SomeClass(double n) {
        number2 = n;
    }

    public SomeClass(int n, double n2) {
        number1 = n;
        number2 = n2;
    }

    public static int subtractThese(int n1, int n2) {
        int result = Math.abs(n1 - n2);
        return result;
    }

    public double convertToSeconds(double minutes) {
        return (minutes * SECONDSINMINUTE);
    }

    public double pizzaTip(int numPizzas) {
        return (numPizzas * 1.50);
    }

    public double pizzaTip(double totalCost) {
        return (totalCost * 0.10);
    }
}