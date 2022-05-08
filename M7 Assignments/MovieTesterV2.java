/**
 * Purpose: Selection sort
 * @author Iker Perez-Calderon
 * @version 3/3/2022
 */
public class MovieTesterV2 {
    public static void main(String[] args) {
        Movie[] movies = {new Movie("Superman: Red Son", 2020, "DC"), new Movie("Morbius", 2022, "Marvel"), new Movie("Interstellar", 2014, "Warner Bros."), new Movie("For All Mankind", 1989, "National Geographic"), new Movie("The Martian", 2015, "TSG Entertainment"), new Movie("Operation Avalanche", 2016, "XYZ Films"), new Movie("In the Shadow of the Moon", 2007, "Discovery Films"), new Movie("Apollo 13", 1995, "Universal Pictures"), new Movie("First Man", 2018, "Universal Pictures"), new Movie("Hidden Figures", 2016, "Fox 2000 Pictures")};
        Movie[] moviesSorted = new Movie[movies.length];
        System.out.println("Movies unsorted.");
        System.out.println();
        output(movies);
        System.out.println();

        System.out.println("Movies sorted by title ascending.");
        System.out.println();
        moviesSorted = titleSort(movies, 1);
        output(moviesSorted);
        System.out.println();

        System.out.println("Movies sorted by title descending.");
        System.out.println();
        moviesSorted = titleSort(movies, 2);
        output(moviesSorted);
        System.out.println();

        System.out.println("Movies sorted by year ascending.");
        System.out.println();
        moviesSorted = yearSort(movies, 1);
        output(moviesSorted);
        System.out.println();

        System.out.println("Movies sorted by year descending.");
        System.out.println();
        moviesSorted = yearSort(movies, 2);
        output(moviesSorted);
        System.out.println();

        System.out.println("Movies sorted by studio ascending.");
        System.out.println();
        moviesSorted = studioSort(movies, 1);
        output(moviesSorted);
        System.out.println();

        System.out.println("Movies sorted by studio descending.");
        System.out.println();
        moviesSorted = studioSort(movies, 2);
        output(moviesSorted);
        System.out.println();
    }

    public static void output(Movie[] inputArray) {
        for(Movie i: inputArray) {
            System.out.println(i);
        }
    }

    public static Movie[] titleSort(Movie[] source, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;
        if(parameter == 1) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getTitle().compareTo(source[posMax].getTitle()) > 0) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else if(parameter == 2) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getTitle().compareTo(source[posMax].getTitle()) < 0) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else {
            System.out.println("Please enter in a valid order number.");
        }
        return source;
    }

    public static Movie[] yearSort(Movie[] source, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;
        if(parameter == 1) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getYear() > source[posMax].getYear()) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else if(parameter == 2) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getYear() < source[posMax].getYear()) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else {
            System.out.println("Please enter in a valid order number.");
        }
        return source;
    }

    public static Movie[] studioSort(Movie[] source, int parameter) {
        int i;
        int k;
        int posMax;
        Movie temp;
        if(parameter == 1) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getStudio().compareTo(source[posMax].getStudio()) > 0) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else if(parameter == 2) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getStudio().compareTo(source[posMax].getStudio()) < 0) {
                        posMax = k;
                    }
                }
                temp = source[i];
                source[i] = source[posMax];
                source[posMax] = temp;
            }
            return source;
        }
        else {
            System.out.println("Please enter in a valid order number.");
        }
        return source;
    }
}