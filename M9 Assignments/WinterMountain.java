/**
 * Purpose: WinterMountain subclass
 * @author Iker Perez-Calderon
 * @version 3/24/2022
 */
public class WinterMountain extends Mountain {
    private int snowDepth;
    private int snowAmount;
    private int temperature;

    public WinterMountain(int l, int w, int h, int mountainAmount, int temperature, int snowDepth, int snowAmount) {
        super(l, w, h, mountainAmount);
        this.snowDepth = snowDepth;
        this.snowAmount = snowAmount;
        this.temperature = temperature;
    }

    public int getSnowDepth() {
        return snowDepth;
    }

    public int getSnowAmount() {
        return snowAmount;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getWinterMountain() {
        return "Winter " + super.getMountain() + ", with a snow amount of " + snowAmount + ", a snow depth of " + snowDepth + ", and a temperature of " + temperature + " degrees";
    }
}