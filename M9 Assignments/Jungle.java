/**
 * Purpose: Jungle subclass
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
public class Jungle extends Forest{
    private int temperature;

    public Jungle(int l, int w, int treesAmount, int treesHeight, int temperature) {
        super(l, w, treesAmount, treesHeight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getJungle() {
        return "Jungle " + super.getTerrainSize() + ", with a temperature of " + temperature + " degrees";
    }
}