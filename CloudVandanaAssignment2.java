import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input strings by using scanner class object
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Checking if they are anagrams
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are they anagrams? " + result);
    }

    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
