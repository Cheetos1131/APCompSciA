/**
 * Purpose: Sequential Search
 * @author Iker Perez-Calderon
 * @version 3/4/2022
 */
public class MusicTester {
    public static void main(String[] args) {
        Music[] playList = new Music[10];
        playList[0] = new Music("Dynamic", 2019, "Voyage");
        playList[1] = new Music("Sunset, Friends and Wine", 2020, "Moon Gem");
        playList[2] = new Music("Division", 2021, "Forhill, Krosia");
        playList[3] = new Music("Plaza", 2021, "System96");
        playList[4] = new Music("Momentum", 2019, "Eagle Eyed Tiger");
        playList[5] = new Music("Arrival(Barca 18)", 2019, "Memorex Memories");
        playList[6] = new Music("Gravity", 2019, "Kattch");
        playList[7] = new Music("Allude", 2019, "Voyage");
        playList[8] = new Music("A Little Bit", 2016, "Special Q");
        playList[9] = new Music("Divergent", 2021, "System96");

        System.out.println("Playlist:\n");
        output(playList);
        System.out.println();

        String title1 = "Division";
        String title2 = "Glowing Tide";
        int year1 = 2016;
        int year2 = 2019;
        int year3 = 2022;
        String artist1 = "Voyage";
        String artist2 = "System96";
        String artist3 = "Laridae";

        System.out.println("Finding title: " + title1 + "\n"); //Finding known title
        findTitle(playList, title1);
        System.out.println();

        System.out.println("Finding title: " + title2 + "\n"); //Finding unused title
        findTitle(playList, title2);
        System.out.println();

        System.out.println("Finding year " + year1 + "\n");
        findYear(playList, year1);
        System.out.println();

        System.out.println("Finding year " + year2 + "\n");
        findYear(playList, year2);
        System.out.println();

        System.out.println("Finding year " + year3 + "\n");
        findYear(playList, year3);
        System.out.println();

        System.out.println("Finding artist " + artist1 +"\n");
        findArtist(playList, artist1);
        System.out.println();

        System.out.println("Finding artist " + artist2 + "\n");
        findArtist(playList, artist2);
        System.out.println();

        System.out.println("Finding artist " + artist3 + "\n");
        findArtist(playList, artist3);
        System.out.println();
    }

    public static void output(Music[] array) {
        for(Music i: array) {
            System.out.println(i);
        }
    }

    public static void findTitle(Music[] array, String find) {
        int found = 0;
        System.out.println("Finding results of " + find + ": ");
        for(int i = 0; i < array.length; i++) {
            if(array[i].getTitle().compareTo(find) == 0) {
                System.out.println(array[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("We have not found the song " + find + " in our playlist.");
        }
        else {
            System.out.println("Found a total of " + found + " results.");
        }
    }

    public static void findYear(Music[] array, int find) {
        int found = 0;
        System.out.println("Finding results of " + find + ": ");
        for(int i = 0; i < array.length; i++) {
            if(array[i].getYear() == find) {
                System.out.println(array[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("We have not found the year " + find + " in our playlist.");
        }
        else {
            System.out.println("Found a total of " + found + " results.");
        }
    }

    public static void findArtist(Music[] array, String find) {
        int found = 0;
        System.out.println("Finding results of " + find + ": ");
        for(int i = 0; i < array.length; i++) {
            if(array[i].getArtist().compareTo(find) == 0) {
                System.out.println(array[i]);
                found++;
            }
        }
        if(found == 0) {
            System.out.println("We have not found the artist " + find + " in our playlist.");
        }
        else {
            System.out.println("Found a total of " + found + " results.");
        }
    }
}