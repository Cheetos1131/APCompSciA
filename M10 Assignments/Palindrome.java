public class Palindrome {
    public static boolean isPalindrome(String n) {
        n = n.toLowerCase();
        System.out.println(n);
        if(n.length() == 1 || n.length() == 0) {
            return true;
        }
        else if(!(n.charAt(0) == n.charAt(n.length() - 1))) {
            return false;
        }
        else {
            return isPalindrome(n.substring(1, n.length() - 1));
        }
    }
}