/**
 * This is a class that tests the Card class.
 *
 *  < Your Name >
 *  < Today's Date >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {
      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card test = new Card("king", "hearts", 13);
      Card test2 = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: king of hearts ****");
      System.out.println("  rank: " + test.rank());
      System.out.println("  suit: " + test.suit());
      System.out.println("  pointValue: " + test.pointValue());
      System.out.println("  toString: " + test.toString());

      // Test card 3
      System.out.println("**** Tests Card 2: ace of hearts ****");
      System.out.println("  rank: " + test2.rank());
      System.out.println("  suit: " + test2.suit());
      System.out.println("  pointValue: " + test.pointValue());
      System.out.println(" toString: " + test2.toString());

      // Test matches() method
      System.out.println(aceHearts.matches(test));
      System.out.println(aceHearts.matches(test2));
   }
}