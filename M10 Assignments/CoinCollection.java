import java.util.ArrayList;

public class CoinCollection {
    private ArrayList<Coin> coins = new ArrayList<Coin>();

    public CoinCollection(int[] years, double[] values, String[] countries) {
        for(int i = 0; i < years.length; i++) {
            coins.add(new Coin(years[i], values[i], countries[i]));
        }
    }

/**
 * The isRare function returns true if the coin is rare, and false otherwise.
 * @param year Check if the coin is rare or not
 * @return A boolean value
 */
    public boolean isRare(int year) {
        for (Coin i : coins) {
            if(i.getMintYear() >= year) {
                return false;
            }
        }
        return true;
    }
}