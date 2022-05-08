public class CoinTester {
    public static void main(String[] args) {
        int[] year1 = {1930, 1925, 1925};
        double[] value1 = {1.00, 0.25, 0.05};
        String[] country1 = {"Mexico", "US", "Britain"};
        int[] year2 = {1925, 1920, 1908};
        double[] value2 = {0.25, 0.50, 1.00};
        String[] country2 = {"US", "US", "US"};
        CoinCollection myCoins = new CoinCollection(year1, value1, country1);
        USCoinCollection usCoins = new USCoinCollection(year2, value2, country2);
        System.out.println(myCoins.isRare(1930));
        System.out.println(usCoins.isRare(1930));
    }
}