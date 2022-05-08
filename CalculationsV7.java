/**
 * The purpose of this program is to showcase the addition,
 * subtraction, multiplication, and division elements of java.
 * @author Iker Perez-Calderon
 * @version August 21, 2021
 */
public class CalculationsV7
{
    public static void main(String[] args)
    {
        
        int integerNum1 = 25;
        int integerNum2 = 9;
        int integerNum3 = 11;
        int integerNum4 = 0;
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        double dNum4 = 12.34;
        // The operations below showcase the addition operator
        System.out.println("addition operator");
        System.out.println(integerNum1 + " + " + integerNum2 + " = " + (integerNum1 + integerNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // The operations below showcase the subtraction operator
        System.out.println("subtraction operator");
        System.out.println(integerNum3 + " - " + integerNum2 + " - " + integerNum1 + " = " + (integerNum3 - integerNum2 - integerNum1));
        System.out.println(dNum2 + " - " + dNum2 + " = " + (dNum2 - dNum3));
        System.out.println();
        
        // The operations below showcase the multiplication operator
        System.out.println("multiplication operator");
        System.out.println(integerNum1 + " * " + integerNum2 + " = " + (integerNum1 * integerNum2)); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();
        
        // The operations below showcase the division operator
        System.out.println("division operator");
        System.out.println(integerNum2 + " / " + integerNum1 + " = " + (integerNum2 / integerNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();
         
        // The operations below showcase the modulus operator
        System.out.println("modulus operator");
        System.out.println(integerNum3 + " % " + integerNum2 + " = " + (integerNum3 % integerNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();
        
        // Extended questions part 1
        System.out.println("1.08");
        System.out.println("(" + integerNum1 + " * " + integerNum1 + ")" + " % " + integerNum2 + " + " + integerNum3 + " = " + ((integerNum1 * integerNum1) % integerNum2 + integerNum4));
        System.out.println("(" + integerNum3 + " / " + integerNum1 + ")" + " - " + integerNum2 + " * " + integerNum3 + " = " + ((integerNum3 / integerNum1) - integerNum2 * integerNum4));
        System.out.println("(" + integerNum3 + " % " + integerNum1 + ")" + " + " + integerNum2 + " / " + integerNum3 + " = " + ((integerNum3 % integerNum1) + integerNum2 / integerNum4));
        System.out.println();
        
        // Extended questions part 2
        System.out.println("1.09");
        System.out.println("(" + dNum1 + " * " + dNum1 + ")" + " % " + dNum2 + " / " + dNum3 + " = " + ((dNum1 * dNum1) % dNum2 / dNum4));
        System.out.println("(" + dNum3 + " / " + dNum1 + ")" + " - " + dNum2 + " * " + dNum3 + " = " + ((dNum3 / dNum1) - dNum2 * dNum4));
        System.out.println("(" + dNum3 + " / " + dNum1 + ")" + " + " + dNum2 + " + " + dNum3 + " = " + ((dNum3 % dNum1) + dNum2 + dNum4));
        System.out.println();
               
    } 
} 
