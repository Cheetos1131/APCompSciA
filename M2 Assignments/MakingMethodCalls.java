/**
 * To call the methods that deal with addition, multiplication, and division on two numbers
 * @author Iker Perez-Calderon
 * @version 9/11/2021
 *
 */ 
public class MakingMethodCalls
{
    public static void addTheseTwo(int x, int y)
    {
        System.out.println("10 + 5 = " + (x + y));
    }   
     
    public static void multiplyTheseTwo(int x, int y)
    {
        System.out.println("10 * 5 = " + (x * y));
    }  
     
    public static int divideTheseTwo(int x, int y)
    {
        return (x / y);
    }    
     
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
         
        addTheseTwo(x, y);
 
        multiplyTheseTwo(x, y);
         
        int answer = divideTheseTwo(x, y);
        System.out.println("10 / 5 = " + answer);  
    }
}