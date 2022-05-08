public class CelestialInformation {
    private String n;
    private double d;
    private double r;
    private double m;
    private double g;

    public CelestialInformation(String name) {
        n = name;
        d = 0.0;
        r = 0.0;
        m = 0.0;
        g = 0.0;
    }

    public CelestialInformation (String name, double diam, double mass) {
        n = name;
        d = diam;
        r = 0.0;
        m = mass;
        g = 0.0;
    }

    public String getName() {
        return n;
    }

    public double getDiam() {
        return d;
    }

    public double getRadius() {
        return r;
    }

    public double getMass() {
        return m;
    }

    public double getGravity() {
        return g;
    }

    public void setName(String name) {
        n = name;
    }

    public void setDiam(double diam) {
        d = diam;
    }

    public void setRadius(double radius) {
        r = radius;
    }

    public void setMass(double mass) {
        m = mass;
    }

    public void setGravity(double gravity) {
        g = gravity;
    }

    public double calcRadius() {
        double radius = 0.0;
        radius = d / 2.0;
        return radius;
    }

    public double calcGravity() {
        double gravityConstant = 6.673 * Math.pow(10, -11);
        return ((gravityConstant * m) / (Math.pow(d, 2)));
    }

    public String toString() {
        return String.format("%-10s %10.1f     %9.1f   %3.1f", getName(), getDiam(), getRadius(), getGravity());
    }
}