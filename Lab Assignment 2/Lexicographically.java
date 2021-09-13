import java.util.Scanner;

class Lexicographically {

    public static int stringCompare(String str1,
        String str2) {
        for (int i = 0; i < str1.length() &&
            i < str2.length(); i++) {
            if ((int) str1.charAt(i) ==
                (int) str2.charAt(i)) {
                continue;
            } else {
                return (int) str1.charAt(i) -
                    (int) str2.charAt(i);
            }
        }

        if (str1.length() < str2.length()) {
            return (str1.length() - str2.length());
        } else if (str1.length() > str2.length()) {
            return (str1.length() - str2.length());
        }

    
        else {
            return 0;
        }
    }

   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String");
        String firstString = sc.next();

        System.out.println("Enter Second String");
        String secondString = sc.next();

        sc.close();

        System.out.println(stringCompare(firstString,
            secondString));

    }
}