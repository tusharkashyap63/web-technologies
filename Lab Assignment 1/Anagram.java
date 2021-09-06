import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String firstString = sc.next();

        System.out.println("Enter Second String");
        String secondString = sc.next();

        sc.close();

        if (areAnagram(firstString.toCharArray(), secondString.toCharArray())) {
            System.out.println("Yes, the two string are anagram of each other.");
        } else {
            System.out.println("No, the strings aren't anagram of each other.");
        }
    }
}