/**
 * Purpose: Challenge Program
 * @author Iker Perez-Calderon
 * @version 4/15/2022
 */
public class StoreTester {
    public static void main(String[] args) {
        Store[] items = new Store[10];
        Store[] itemsCopy = items;
        Store[] arraySorted = new Store[items.length];
        items[0] = new Store("Ryzen 7 3800X", 2304, 68.42, 1);
        items[1] = new Store("RTX 2070 Super", 4748, 25.42, 9);
        items[2] = new Store("Trident Z Neo", 9993, 99.73, 2);
        items[3] = new Store("M240LV2", 5439, 64.01, 80);
        items[4] = new Store("BX500 SSD", 2494, 31.14, 46);
        items[5] = new Store("GTX 970", 3227, 94.68, 32);
        items[6] = new Store("Athlon 64", 3084, 10.34, 765);
        items[7] = new Store("Core 2 Duo", 8063, 57.28, 248);
        items[8] = new Store("TM30", 5332, 77.42, 423);
        items[9] = new Store("TPU Filament", 4247, 51.49, 34);

        System.out.println("Original");
        output(items);
        System.out.println();

        System.out.println("Product Number Merge Sort");
        mergeSortProduct(itemsCopy, 0, 9);
        output(itemsCopy);
        System.out.println();

        System.out.println("Price Merge Sort");
        mergeSort(items, 0, 9);
        output(items);
        System.out.println();

        System.out.println("Name Insertion Sort Asc");
        arraySorted = nameSort(items, 1);
        output(arraySorted);
        System.out.println();

        System.out.println("Name Insertion Sort Desc");
        arraySorted = nameSort(items, 2);
        output(arraySorted);
        System.out.println();

        System.out.println("Quantity Selection Sort Asc");
        arraySorted = quantitySort(items, 1);
        output(arraySorted);
        System.out.println();

        System.out.println("Quantity Selection Sort Desc");
        arraySorted = quantitySort(items, 2);
        output(arraySorted);
        System.out.println();
    }
    public static void output(Store[] source) {
        System.out.println("           Name                |   Product#   |     Price     |   Quantity   ");
        System.out.println("--------------------------------------------------------------------------");
        for(int k = 0; k < source.length; k++) {
            System.out.println(source[k]);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
    public static Store[] quantitySort(Store[] source, int parameter) {
        int i;
        int k;
        int posMax;
        Store temp;
        if(parameter == 1) {
            for(i = source.length - 1; i >= 0; i--) {
                posMax = 0;
                for(k = 0; k <= i; k++) {
                    if(source[k].getQuantity() > source[posMax].getQuantity()) {
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
                    if(source[k].getQuantity() < source[posMax].getQuantity()) {
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
    public static Store[] nameSort(Store[] source, int parameter) {
        Store[] destination = new Store[source.length];
        if(parameter == 1) {
            for(int i = 0; i < source.length; i++) {
                Store next = source[i];
                int insertIndex = 0;
                int k = i;
                while(k > 0 && insertIndex == 0) {
                    if(next.getName().compareTo(destination[k - 1].getName()) > 0) {
                        insertIndex = k;
                    }
                    else {
                        destination[k] = destination[k - 1];
                    }
                    k--;
                }
                destination[insertIndex] = next;
            }
            return destination;
        }
        else if(parameter == 2) {
            for(int i = 0; i < source.length; i++) {
                Store next = source[i];
                int insertIndex = 0;
                int k = i;
                while(k > 0 && insertIndex == 0) {
                    if(next.getName().compareTo(destination[k - 1].getName()) < 0) {
                        insertIndex = k;
                    }
                    else {
                        destination[k] = destination[k - 1];
                    }
                    k--;
                }
                destination[insertIndex] = next;
            }
            return destination;
        }
        else {
            System.out.println("Please enter in a valid order number.");
        }
        return destination;
    }
    public static void mergeSortProduct(Store[] a, int low, int high) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSortProduct(a, low, mid);
        mergeSortProduct(a, mid + 1, high);
        mergeProduct(a, low, mid, high);
    }
    public static void mergeProduct(Store[] a, int low, int mid, int high) {
        Store[] temp = new Store[high - low + 1];
        int i = low;
        int j = mid + 1;
        int n = 0;
        while(i <= mid || j <= high) {
            if(i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if(j > high) {
                temp[n] = a[i];
                i++;
            }
            else if(a[i].getProdNumb() < a[j].getProdNumb()) {
                // < for asc, > for desc
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++) {
            a[k] = temp[k - low];
        }
    }
    public static void mergeSort(Store[] a, int low, int high) {
        if(low == high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(a, low, mid);
        mergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }
    public static void merge(Store[] a, int low, int mid, int high) {
        Store[] temp = new Store[high - low + 1];
        int i = low;
        int j = mid + 1;
        int n = 0;
        while(i <= mid || j <= high) {
            if(i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if(j > high) {
                temp[n] = a[i];
                i++;
            }
            else if(a[i].getPrice() < a[j].getPrice()) {
                // < for asc, > for desc
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        for(int k = low; k <= high; k++) {
            a[k] = temp[k - low];
        }
    }
}