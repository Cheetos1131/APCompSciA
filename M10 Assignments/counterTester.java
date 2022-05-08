import java.util.ArrayList;
public class counterTester {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        test.add("be happy");
        test.add("happy");
        test.add("I am happy");
        test.add("happy happy joy joy");
        test.add("happy");

        System.out.println(countOccurences(test, "happy"));
    }

    public static int countOccurences(ArrayList<String> arr, String str) {
        int count = 0;
        for(String i: arr) {
            if(i.equals(str)) {
                count++;
            }
        }
        if(count == 0) {
            return -1;
        }
        return count;
    }
}