package Strings;
public class Palindrome_String_01 {
    public static boolean isPalindrone(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String Str = "racecar";
        System.out.println(isPalindrone(Str));
    }
}