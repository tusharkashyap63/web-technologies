import java.util.ArrayList;
import java.util.Collections;

public class ArrangingOddEven {
    static ArrayList < Integer > arrangingOddEven(int[] arr) {
        ArrayList < Integer > evenNums = new ArrayList < Integer > ();
        ArrayList < Integer > oddNums = new ArrayList < Integer > ();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNums.add(arr[i]);
            } else {
                oddNums.add(arr[i]);
            }
        }

        Collections.sort(evenNums);
        Collections.sort(oddNums);

        oddNums.addAll(evenNums);

        return oddNums;
    }
    public static void main(String[] args) {
        int arr[] = {
            2,
            35,
            76,
            12,
            43,
            1
        };

        System.out.println(arrangingOddEven(arr));
    }

}