/**
 * Purpose: To use an array of objects to easily create and modify objects to then be displayed through toString() and printf() methods.
 * @author Iker Perez-Calderon 
 * @version 2/6/2022
 * 
 */
public class CelestialInformationTester {
    public static void main(String[] args) {
        // Planet name, diameter, mass, and gravity
        String name1 = "Mercury";
        double diam1 = 4878 * 1000.0;
        double mass1 = 3.285 * Math.pow(10, 23);

        String name2 = "Venus";
        double diam2 = 12103.6 * 1000.0;
        double mass2 = 4.867 * Math.pow(10, 24);

        String name3 = "Earth";
        double diam3 = 12742 * 1000.0;
        double mass3 = 5.972 * Math.pow(10, 24);

        String name4 = "Mars";
        double diam4 = 3396.2 * 1000.0;
        double mass4 = 6.4171 * Math.pow(10, 23);

        String name5 = "Ceres"; 
        double diam5 = 946 * 1000.0;
        double mass5 = 9.3835e20;

        double radius = 0.0;
        double gravity = 0.0;

        CelestialInformation[] celestialBodies = {new CelestialInformation(name1, diam1, mass1), new CelestialInformation(name2, diam2, mass2), new CelestialInformation(name3, diam3, mass3), new CelestialInformation(name4, diam4, mass4), new CelestialInformation(name5, diam5, mass5)};
        System.out.println("                Celestial Bodies");
        System.out.printf("%s    %14s %12s   %12s %n", "Body", "Diameter(m)", "Radius(m)", "Gravity(m/s^2)");
        System.out.println("***************************************************");

        for(CelestialInformation p: celestialBodies) {
            gravity = p.calcGravity();
            p.setGravity(gravity);
            radius = p.calcRadius();
            p.setRadius(radius);
            System.out.println(p);
        }

    }
}
