//import java.util.Scanner;
public class bubblesort 
{

    static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (array[j-1] > array[j]) {
                    // Swap array elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }
    public static void main(String[] args) 
    {   
        int array[] = {64 , 224, 6, 2, 14, 9, 8, 7, 2, 15};
        System.out.println("Array before sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSort(array); // Unoptimized bubble sort alogrithm

        System.out.println("Array after bubble sort:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}