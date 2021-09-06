import java.util.Scanner;

public class FirstLetterUppercase {

    static String convertToUpperCase(String para) {
        String[] words = para.split(" ");
        String updatedPara = "";

        for (String str: words) {
            char uppercaseLetter = Character.toUpperCase(str.charAt(0));

            str = Character.toString(uppercaseLetter) + str.substring(1);

            updatedPara += " " + str;
        }
        return updatedPara;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Paragraph");
        String paragraph = sc.nextLine();
        sc.close();
        System.out.println("Updated Para:" + convertToUpperCase(paragraph));
    }

}