/**
 * The purpose of this program is to display the number of tests,
 * grades, total points and the average of all the tests
 * 
 * @author Iker Perez 
 * @version August 24, 2021
 */
public class Assignment112
{
    public static void main(String[ ] args)
    {
        //local variables       
        int numTests = 0; 
        int testGrade = 0;
        int totalPoints = 0;       
        double average = 0.0;        
        
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 100;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 98;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 85;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 90;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);

        numTests++;
        testGrade = 99;
        totalPoints += testGrade;
        average = (totalPoints / (double)numTests);
        System.out.println("Test number: " + numTests + "\tGrade: " + testGrade + "\tTotal Points: " + totalPoints + "\tAverage: " + average);
        
    }
}
