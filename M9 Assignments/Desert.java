public class Desert extends Terrain {
    private int temperature;

    public Desert(int l, int w, int temperature) {
        super(l, w);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDesert() {
        return "Desert " + super.getTerrainSize() + ", and a temperature of " + temperature + " degrees";
    }
}