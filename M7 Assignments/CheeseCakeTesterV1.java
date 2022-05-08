/**
 * @purpose learn how to use arraylists
 *
 * @author Iker Perez-Calderon
 * @version 3/1/2022
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declaring an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            cake.add(new CheeseCakeV1("Blueberry", 3));
            cake.add(new CheeseCakeV1("Apple", 5));
            cake.add(new CheeseCakeV1("Cheery", 4));
            cake.add(new CheeseCakeV1("Jalapeno", 7));
            cake.add(new CheeseCakeV1("Fig", 2));
            cake.add(new CheeseCakeV1("Orange", 1));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            // invoke methods
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println("|   " + index + "   |" + cake.get(index));
        }
    }
}