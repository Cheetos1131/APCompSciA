/**
 * Purpose: 2D Array
 * @author Iker Perez-Calderon
 * @version 3/5/2022
 */
public class CatapultTester {
    public static void main(String[] args) {
        double[] velocity = {50, 60, 70, 80, 90, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 343, 344, 350};
        double[] angles = {25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
        Catapult variables = new Catapult(velocity, angles);

        double[][] distanceResults = variables.calcDistance();
        output(distanceResults, velocity);
    }
    //Create an output method that displays the results
    public static void output(double[][] source, double[] speeds) {
        System.out.println("                                                            Catapult Distances (meters):");
        System.out.println("KPH| Degrees ==>|   25         30         35         40         45         50         55         60         65         70         75         80         85");
        System.out.println("===============================================================================================================================================================");
        for(int i = 0; i < source.length; i++) {
            System.out.printf("%-4.0f                ", speeds[i] * 3.6);
            for(int j = 0; j < source[i].length; j++) {
                System.out.printf("%-8.2f   ", source[i][j]);
            }
            System.out.println();
        }
    }
}
