public class Calc
{
    public static void main(String[] args)
    {

        int value = 7;
        int divisor = 2;
        double actualResult = 0.0;
        System.out.println("The Original Value: " + value);
        System.out.println("The whole number result: " + (value / divisor));
        System.out.println("The remainder from the operation: " + (value % divisor));
        actualResult = (double)value / divisor;
        System.out.println("The actual decimal result from the operation: " + actualResult);
        
    }
}