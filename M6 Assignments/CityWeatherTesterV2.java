/**
 * Purpose: To use arrays to display data about a city's temperature and precipitation over each month and annually
 * @author Iker Perez-Calderon
 * @version 2/2/2022
 * 
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    public static void results(String city, String state, String tempLabel, String precipLabel, String[] month, double[] temperature, double[] precipitation, double convertAverageTemp, double convertPrecipTotal) {
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("---------------------------------------------------");
        for (int i = 0; i<month.length; i++) {
            System.out.printf("%-4s", month[i]);
            System.out.printf("%14.1f", temperature[i]);
            System.out.printf("%20.1f %n", precipitation[i]);
        }
        System.out.println("---------------------------------------------------");
        //System.out.println("Average: " + convertAverageTemp + "  Total: " + convertPrecipTotal); //use printf to format
        System.out.printf("     Average: %.1f", convertAverageTemp);
        System.out.printf("       Annual: %.1f", convertPrecipTotal);
    }

    
    public static void main (String [ ] args)
    {
        Scanner in = new Scanner(System.in); 
        String city = "Fort Myers";  
        String state = "FL";  
  
        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double [] temperature ={64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.7, 66.4};
        double [] precipitation ={2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6};
    
        String tempLabel = "F";
        String precipLabel = "in.";

        CityWeatherV2 city1 = new CityWeatherV2(month, temperature, precipitation);

        String answer1 = " ";
        String answer2 = " ";
        System.out.print("Fahrenheit or Celsius: (F/C) ");
        answer1 = in.next();
        System.out.println();
        System.out.print("Inches or Centimeters: (I/C) ");
        answer2 = in.next();
        System.out.println();
        double convertAverageTemp = city1.averageTemp();
        double convertPrecipTotal = city1.precipTotal();

        if (answer1.equalsIgnoreCase("C")) {
            city1.convertCelsius();
            tempLabel = "C";
            convertAverageTemp = ((city1.averageTemp() - 32) * (5.0/9.0));
        }

        if (answer2.equalsIgnoreCase("C")) {
            city1.convertCentimeters();
            precipLabel = "cm.";
            convertPrecipTotal = (city1.precipTotal() * 2.54);
        }

        results(city, state, tempLabel, precipLabel, month, temperature, precipitation, convertAverageTemp, convertPrecipTotal);
        in.close();
    }
}