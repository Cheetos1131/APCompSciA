/**
 * Purpose: To test on concepts learned
 * @version 3/1/2022
 * @author Iker Perez-Calderon
 *
 */
 
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int[] category = new int[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            category[index] = 0;
            index++;
        }
        inFile.close();

        for(int i = 0; i < windSpeeds.length; i++) {
            windSpeeds[i] *= 1.151;
            if (windSpeeds[i] <= 95 && windSpeeds[i] >= 74) {
                category[i] = 1;
            }
            else if (windSpeeds[i] <= 110 && windSpeeds[i] >= 96) {
                category[i] = 2;
            }
            else if (windSpeeds[i] <= 129 && windSpeeds[i] >= 111) {
                category[i] = 3;
            }
            else if (windSpeeds[i] <= 156 && windSpeeds[i] >= 130) {
                category[i] = 4;
            }
            else if (windSpeeds[i] > 157) {
                category[i] = 5;
            }
        }
        
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>();
        for (int k = 0; k < numValues; k++) {
            hurricanes.add(new Hurricane(years[k], names[k], months[k], category[k], pressures[k], windSpeeds[k]));
        }
        
        System.out.print("Input start year (1995): ");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.print("Input end year (2019): ");
        int end = input.nextInt();
        input.close();

        int maxCategory = Integer.MIN_VALUE;
        int minCategory = Integer.MAX_VALUE;

        int cat1Counter = 0;
        int cat2Counter = 0;
        int cat3Counter = 0;
        int cat4Counter = 0;
        int cat5Counter = 0;

        int maxPressure = Integer.MIN_VALUE;
        int minPressure = Integer.MAX_VALUE;
        int totalPressure = 0;

        double maxWindspeed = Double.MIN_VALUE;
        double minWindspeed = Double.MAX_VALUE;
        double totalWindspeed = 0.0;

        double avgCategory = 0.0;
        double avgPressure = 0.0;
        double avgWindspeed = 0.0;

        System.out.println(" Year     Hurricane     Category     Pressure(mb)     Wind Speed(mph) ");
        System.out.println("======================================================================");

        for(Hurricane i: hurricanes) {
            if (i.getYear() >= start && i.getYear() <= end) {
                if(i.getCat() == 1) {
                    cat1Counter++;
                    minCategory = 1;
                    totalPressure += i.getPressure();
                    totalWindspeed += i.getWindspeed();
                    if(i.getCat() > maxCategory) {
                        maxCategory = 1;
                    }
                    if(i.getPressure() < minPressure) {
                        minPressure = i.getPressure();
                    }
                    if(i.getPressure() > maxPressure) {
                        maxPressure = i.getPressure();
                    }
                    if(i.getWindspeed() < minWindspeed) {
                        minWindspeed = i.getWindspeed();
                    }
                    if(i.getWindspeed() > maxWindspeed) {
                        maxWindspeed = i.getWindspeed();
                    }
                }
                else if(i.getCat() == 2) {
                    cat2Counter++;
                    totalPressure += i.getPressure();
                    totalWindspeed += i.getWindspeed();
                    if(i.getCat() < minCategory) {
                        minCategory = 2;
                    }
                    if(i.getCat() > maxCategory) {
                        maxCategory = 2;
                    }
                    if(i.getPressure() < minPressure) {
                        minPressure = i.getPressure();
                    }
                    if(i.getPressure() > maxPressure) {
                        maxPressure = i.getPressure();
                    }
                    if(i.getWindspeed() < minWindspeed) {
                        minWindspeed = i.getWindspeed();
                    }
                    if(i.getWindspeed() > maxWindspeed) {
                        maxWindspeed = i.getWindspeed();
                    }
                }
                else if(i.getCat() == 3) {
                    cat3Counter++;
                    totalPressure += i.getPressure();
                    totalWindspeed += i.getWindspeed();
                    if(i.getCat() < minCategory) {
                        minCategory = 3;
                    }
                    if(i.getCat() > maxCategory) {
                        maxCategory = 3;
                    }
                    if(i.getPressure() < minPressure) {
                        minPressure = i.getPressure();
                    }
                    if(i.getPressure() > maxPressure) {
                        maxPressure = i.getPressure();
                    }
                    if(i.getWindspeed() < minWindspeed) {
                        minWindspeed = i.getWindspeed();
                    }
                    if(i.getWindspeed() > maxWindspeed) {
                        maxWindspeed = i.getWindspeed();
                    }
                }
                else if(i.getCat() == 4) {
                    cat4Counter++;
                    totalPressure += i.getPressure();
                    totalWindspeed += i.getWindspeed();
                    if(i.getCat() < minCategory) {
                        minCategory = 4;
                    }
                    if(i.getCat() > maxCategory) {
                        maxCategory = 4;
                    }
                    if(i.getPressure() < minPressure) {
                        minPressure = i.getPressure();
                    }
                    if(i.getPressure() > maxPressure) {
                        maxPressure = i.getPressure();
                    }
                    if(i.getWindspeed() < minWindspeed) {
                        minWindspeed = i.getWindspeed();
                    }
                    if(i.getWindspeed() > maxWindspeed) {
                        maxWindspeed = i.getWindspeed();
                    }
                }
                else if(i.getCat() == 5) {
                    cat5Counter++;
                    totalPressure += i.getPressure();
                    totalWindspeed += i.getWindspeed();
                    maxCategory = 5;
                    if(i.getCat() < minCategory) {
                        minCategory = 5;
                    }
                    if(i.getPressure() < minPressure) {
                        minPressure = i.getPressure();
                    }
                    if(i.getPressure() > maxPressure) {
                        maxPressure = i.getPressure();
                    }
                    if(i.getWindspeed() < minWindspeed) {
                        minWindspeed = i.getWindspeed();
                    }
                    if(i.getWindspeed() > maxWindspeed) {
                        maxWindspeed = i.getWindspeed();
                    }
                }
                System.out.println(i);
            }
        }
        avgCategory = (((cat1Counter * 1) + (cat2Counter * 2) + (cat3Counter * 3) + (cat4Counter * 4) + cat5Counter * 5) / (double)(cat1Counter + cat2Counter + cat3Counter +cat4Counter + cat5Counter));
        avgPressure = (totalPressure / (double)(cat1Counter + cat2Counter + cat3Counter +cat4Counter + cat5Counter));
        avgWindspeed = (totalWindspeed / (double)(cat1Counter + cat2Counter + cat3Counter +cat4Counter + cat5Counter));

        System.out.println("======================================================================");
        System.out.printf("     Average:              %3.1f           %5.1f            %6.2f \n", avgCategory, avgPressure, avgWindspeed);
        System.out.printf("     Minimum:              %1d            %4d              %6.2f \n", minCategory, minPressure, minWindspeed);
        System.out.printf("     Maximum:              %1d            %4d              %6.2f \n", maxCategory, maxPressure, maxWindspeed);
        System.out.println("Summary of Categories:");
        System.out.println("Cat 1: " + cat1Counter);
        System.out.println("Cat 2: " + cat2Counter);
        System.out.println("Cat 3: " + cat3Counter);
        System.out.println("Cat 4: " + cat4Counter);
        System.out.println("Cat 5: " + cat5Counter);
    }
}