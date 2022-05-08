public class Catapult {
    private double[] velocity;
    private double[] angle;
    
    public Catapult(double[] velocity, double[] angle) {
        this.velocity = velocity;
        this.angle = angle;
    }

    public double[][] calcDistance() {
        double[][] distances = new double[velocity.length][angle.length];
        for(int i = 0; i < velocity.length; i++) {
            for(int j = 0; j < angle.length; j++) {
                distances[i][j] = (Math.pow(velocity[i], 2) * Math.sin(2 * Math.toRadians(angle[j])) / 9.81);
            }
        }
        return distances;
    }
}