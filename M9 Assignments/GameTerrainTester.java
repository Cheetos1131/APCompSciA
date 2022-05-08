public class GameTerrainTester {
    public static void main(String[] args) {
        Terrain land1 = new Terrain(400, 700);
        Mountain land2 = new Mountain(4000, 3500, 5500, 22);
        WinterMountain land3 = new WinterMountain(4000, 3500, 5500, 22, 5, 5, 75);
        Desert land4 = new Desert(5000, 6000, 150);
        Forest land5 = new Forest(4000, 4000, 90, 20);
        Jungle land6 = new Jungle(400, 400, 95, 50, 95);

        System.out.println(land1.getTerrainSize());
        System.out.println();
        System.out.println(land2.getMountain());
        System.out.println();
        System.out.println(land3.getWinterMountain());
        System.out.println();
        System.out.println(land4.getDesert());
        System.out.println();
        System.out.println(land5.getForest());
        System.out.println();
        System.out.println(land6.getJungle());
    }
}