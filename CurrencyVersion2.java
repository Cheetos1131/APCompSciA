/**
 * The purpose of this program is to convert monetary
 * values and display them for 3 countries. Each total
 * value spent is subtracted from the last conversion
 * to create a sense of a budget.
 *
 *@author Iker Perez
 *@version 8/26/2021
 */
public class CurrencyVersion2
{
    public static void main(String [] args)
    {
        // Variable Declaration and Initialization
        double startingUsd = 6500.00;
        // Other Currency And Their Exchange Rates
        double pesosSpent = 7210.25;            
        double pesoExchangeRate = 20.20;     
        double usdSpentInMexico = 0.0;      
        double usdAfterMexico = 0.0;
        double yenSpent = 4040.0;
        double yenExchangeRate = 109.83;
        double usdSpentInJapan = 0.0;
        double usdAfterJapan = 0.0;
        double wonSpent = 50505.0;
        double wonExchangeRate = 1162.33;
        double usdSpentInROK = 0.0;
        double usdAfterROK = 0.0;   
        
        System.out.println("--------------------------------------------------");
        System.out.println("The purpose of this program is to convert monetary");
        System.out.println("values and display them for 3 countries. Each total");
        System.out.println("value spent is subtracted from the last conversion");
        System.out.println("to create a sense of a budget.");
        System.out.println("--------------------------------------------------");
        System.out.println();

        System.out.println("Budget in USD:\t" + startingUsd);
        System.out.println();

        // Conversion Code for Mexico
        System.out.println("Mexico Visit");
        System.out.println("Spent Pesos:\t" + pesosSpent);
        System.out.println("Exchange rate for Peso from 1 USD:\t" + pesoExchangeRate);
        usdSpentInMexico = pesosSpent / pesoExchangeRate;
        usdAfterMexico = startingUsd - usdSpentInMexico;
        System.out.println("USD spent in Mexico: " + usdSpentInMexico);
        System.out.println("USD remaining after Mexico: " + usdAfterMexico);
        System.out.println();

        // Conversion Code for Japan
        System.out.println("Japan Visit");
        System.out.println("Yen Spent:\t" + yenSpent);
        System.out.println("Exchange rate for Yen from 1 USD:\t" + yenExchangeRate);
        usdSpentInJapan = yenSpent / yenExchangeRate;
        usdAfterJapan = usdAfterMexico - usdSpentInJapan;
        System.out.println("USD spent in Japan: " + usdSpentInJapan);
        System.out.println("USD remaining after Japan: " + usdAfterJapan);
        System.out.println();

        // Conversion Code for Republic of Korea
        System.out.println("Republic of Korea Visit");
        System.out.println("Won Spent:\t" + wonSpent);
        System.out.println("Exchange rate for Won from 1 USD:\t" + wonExchangeRate);
        usdSpentInROK = wonSpent / wonExchangeRate;
        usdAfterROK = usdAfterJapan - usdSpentInROK;
        System.out.println("USD spent in Republic of Korea: " + usdSpentInROK);
        System.out.println("USD remaining after Republic of Korea: " + usdAfterROK);
        System.out.println();

        System.out.println("==================================================");
        System.out.println("Remaining USD: " + usdAfterROK);
        System.out.println();

        // Souvenir Section
 		System.out.println("*****************************");
		System.out.println("Souvenir Purchases Section");
		System.out.println(" (all values are in USD)");
		System.out.println("*****************************");

		//Calculations for Souvenir #1 stuff
		int costItem1 = 12; 
		int budget1 = 127;   						
		int totalSouvenirs1 = budget1 / costItem1; 		
		int cashRemaining1 =  budget1 % totalSouvenirs1;
        
		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalSouvenirs1);
		System.out.println("   Cash left over: $"  +  cashRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2 stuff
		double costItem2 = 29.99;  						
		int budget2 = 552;   							
		int totalSouvenirs2 = (int)(budget2 / costItem2); 	
		double cashRemaining2 = budget2 % totalSouvenirs2; 

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalSouvenirs2);
		System.out.println("   Cash left over: $"  +  cashRemaining2);

    } 
} 