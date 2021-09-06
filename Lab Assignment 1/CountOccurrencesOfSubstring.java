public class CountOccurrencesOfSubstring {

    public static void main(String[] args) {
        String str = "This is the string we want we to we find substrings in";
        String subStr = "we";
        int count = 0, fromIndex = 0;

        while ((fromIndex = str.indexOf(subStr, fromIndex)) != -1) {

            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;

        }

        System.out.println("Total occurrences: " + count);
    }
}