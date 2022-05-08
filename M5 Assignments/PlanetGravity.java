/**
 * Purpose: To calculate and display a planet's name, mass, diameter, and gravitational acceleration
 * @author Iker Perez-Calderon
 * @version 12/24/2021
 */

import java.lang.Math;

public class PlanetGravity {
    public static void main(String[] args) {
        String planetName = "Mars";
        int planetDiameter = 6794;
        int planetRadius = (planetDiameter / 2) * 1000;
        double planetMass = 6.4219 * Math.pow(10, 23);
        double gravitationalConstant = 6.67 * Math.pow(10, -11);
        titleHeader();
        planetaryData(planetName, planetDiameter, planetMass, planetaryGravity(gravitationalConstant, planetMass, planetRadius));
    }

    public static void titleHeader() {
        System.out.println("\t\tPlanetary Data");
        System.out.println("Planet\t Diameter (km)\t Mass (kg)   g (m/s^2)");
        System.out.println("**********************************************");
    }

    public static void planetaryData(String planet, int diameter, double mass, double g) {
        System.out.println(planet + "\t " + diameter + ".0\t         " + "6.4219E+23" + "   " + g);

    }

    public static double planetaryGravity(double G, double Mass, int Radius) {
        double gravity = 0.0;
        gravity = (G * Mass) / (Math.pow(Radius, 2));
        gravity = (double)Math.round(gravity * 100) / 100;
        return gravity;
    }
}
