import java.util.*;

public class ReplaceWithStars {

    static String replacepara(String para, List < String > stringList) {
        Map < String, String > mapReplace = new HashMap < String, String > ();

        String[] paraArray = para.split(" ");
        String replacedString = "";

        for (String str: stringList) {
            int n = str.length();
            String replaceword = Character.toString(str.charAt(0));
            for (int i = 1; i < n; i++) {
                replaceword += "*";
            }
            mapReplace.put(str, replaceword);
        }

        for (String stringword: paraArray) {
            if (mapReplace.containsKey(stringword)) {
                replacedString += " " + mapReplace.get(stringword);
            } else {
                replacedString += " " + stringword;
            }
        }

        return replacedString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph");
        String paragraph = sc.nextLine();
        sc.close();

        ArrayList < String > list = new ArrayList < String > ();
        list.add("Hello");
        list.add("Hey");

        System.out.println("After replacing paragraph:" + replacepara(paragraph, list));
    }

}