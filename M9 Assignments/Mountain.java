/**
 * Purpose: Mountain superclass
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
public class Mountain extends Terrain {
    private int height;
    private int mountainAmount;

    public Mountain(int l, int w, int h, int mountainAmount) {
        super(l, w);
        height = h;
        this.mountainAmount = mountainAmount;
    }

    public int getHeight() {
        return height;
    }

    public int getMountainAmount() {
        return mountainAmount;
    }

    public String getMountain() {
        return "Mountain " + super.getTerrainSize() + " X " + height + ", and " + mountainAmount + " mountains";
    }
}