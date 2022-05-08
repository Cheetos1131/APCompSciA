public class MusicTesterV2 {
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

        System.out.println("Original array:");
        output(playList);
        System.out.println();

        //System.out.println("titleSort test:");
        //output(titleSort(playList));
        //System.out.println();

        //System.out.println("yearSort test:");
        //output(yearSort(playList));
        //System.out.println();

        //System.out.println("albumSort test:");
        //output(albumSort(playList));
        //System.out.println();

        //Start the prompt on 6 and 7
        String name1 = "Dynamic";
        String name2 = "Phosphors";
        int year1 = 2019;
        int year2 = 2016;
        int year3 = 2002;
        String name3 = "Voyage";
        String name4 = "Kattch";
        String name5 = "Home";

        System.out.println("Finding the Song name: " + name1);
        binarySearchTitle(titleSort(playList), name1);
        System.out.println();

        System.out.println("Finding the song name: " + name2);
        binarySearchTitle(titleSort(playList), name2);
        System.out.println();

        System.out.println("Finding songs in the year: " + year1);
        binarySearchYear(yearSort(playList), year1);
        System.out.println();

        System.out.println("Finding songs in the year: " + year2);
        binarySearchYear(yearSort(playList), year2);
        System.out.println();

        System.out.println("Finding songs in the year: " + year3);
        binarySearchYear(yearSort(playList), year3);
        System.out.println();

        System.out.println("Finding artist: " + name3);
        binarySearchArtist(albumSort(playList), name3);
        System.out.println();

        System.out.println("Finding artist: " + name4);
        binarySearchArtist(albumSort(playList), name4);
        System.out.println();

        System.out.println("Finding artist: " + name5);
        binarySearchArtist(albumSort(playList), name5);
        System.out.println();
    }

    public static void output(Music[] array) {
        for(Music i: array) {
            System.out.println(i);
        }
    }

    public static Music[] titleSort(Music[] source) {
        Music[] dest = new Music[source.length];
        for(int i = 0; i < source.length; i++) {
            Music next = source[i];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0) {
                if(next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
                    insertIndex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }

    public static Music[] yearSort(Music[] source) {
        Music[] dest = new Music[source.length];
        for(int i = 0; i < source.length; i++) {
            Music next = source[i];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0) {
                if(next.getYear() > dest[k - 1].getYear()) {
                    insertIndex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }

    public static Music[] albumSort(Music[] source) {
        Music[] dest = new Music[source.length];
        for(int i = 0; i < source.length; i++) {
            Music next = source[i];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0) {
                if(next.getArtist().compareTo(dest[k - 1].getArtist()) > 0) {
                    insertIndex = k;
                }
                else {
                    dest[k] = dest[k - 1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }

    public static void binarySearchTitle(Music[] source, String find) {
        int high = source.length;
        int low = -1;
        int probe;
        while(high - low > 1) {
            probe = (high + low) / 2;
            if(source[probe].getTitle().compareTo(find) > 0) {
                high = probe;
            }
            else {
                low = probe;
                if(source[probe].getTitle().compareTo(find) == 0) {
                    break;
                }
            }
        }
        if((low >= 0) && (source[low].getTitle().compareTo(find) == 0)) {
            linearPrintLocatorTitle(source, low, find);
        }
        else {
            System.out.println("Not found: " + find);
        }
    }

    public static void binarySearchArtist(Music[] source, String find) {
        int high = source.length;
        int low = -1;
        int probe;
        while(high - low > 1) {
            probe = (high + low) / 2;
            if(source[probe].getArtist().compareTo(find) > 0) {
                high = probe;
            }
            else {
                low = probe;
                if(source[probe].getArtist().compareTo(find) == 0) {
                    break;
                }
            }
        }
        if((low >= 0) && (source[low].getArtist().compareTo(find) == 0)) {
            linearPrintLocatorArtist(source, low, find);
        }
        else {
            System.out.println("Not found: " + find);
        }
    }

    public static void binarySearchYear(Music[] source, int find) {
        int high = source.length;
        int low = -1;
        int probe;
        while(high - low > 1) {
            probe = (high + low) / 2;
            if(source[probe].getYear() > find) {
                high = probe;
            }
            else {
                low = probe;
                if(source[probe].getYear() == find) {
                    break;
                }
            }
        }
        if((low >= 0) && (source[low].getYear() == find)) {
            linearPrintLocatorYear(source, low, find);
        }
        else {
            System.out.println("Not found: " + find);
        }

    }

    public static void linearPrintLocatorArtist(Music[] source, int low, String find) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getArtist().compareTo(find) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < source.length) && (source[i].getArtist().compareTo(find) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(source[i]);
        }
    }

    public static void linearPrintLocatorTitle(Music[] source, int low, String find) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getTitle().compareTo(find) == 0)) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < source.length) && (source[i].getTitle().compareTo(find) == 0)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(source[i]);
        }
    }

    public static void linearPrintLocatorYear(Music[] source, int low, int find) {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getYear() == find)) {
            start = i;
            i--;
        }
        i = low + 1;
        while((i < source.length) && (source[i].getYear() == find)) {
            end = i;
            i++;
        }
        for(i = start; i <= end; i++) {
            System.out.println(source[i]);
        }
    }
}