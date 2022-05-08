/**
 * @purpose learn how to use arraylists
 *
 * @author Iker Perez-Calderon
 * @version 3/1/2022
 *
 */
public class CheeseCakeV1 {
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;
    
   /**
    * Constructor for objects of type CheeseCakeV1
    * @param flavor
    * @param quantity
    * 1 quantity, 16 servings, 32oz cream cheese, 1/3 cup sugar, 1 tsps vanilla
    */
    CheeseCakeV1(String flavor, int quantity) {
        myFlavor = flavor;
        myQuantity = quantity;
        mySugar = 0.0;
        myServings = 0;
        myCreamCheese = 0;
        myVanilla = 0;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings() {
        myServings = myQuantity * 16;
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese() {
        myCreamCheese = myQuantity * 32;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla() {
        myVanilla = myQuantity;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar() {
        mySugar = myQuantity * 0.33;
    }    

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity() {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor() {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar() {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese() {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla() {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings() {
        return myServings;
    }
    
    public String toString() {
        return String.format("     %1d    |   %-9s   |    %3d oz    |    %3d   | %1.2f cups |   %1d tsps  |", getquantity(), getFlavor(), getCreamCheese(), getServings(), getSugar(), getVanilla());
    }
}