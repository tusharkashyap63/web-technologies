import java.util.Scanner;

public class QuesFive {
    static int[] askForSet(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of " + name + " less than 11");
        int size = sc.nextInt();
        int[] set = new int[size];
        System.out.println("Enter elements of " + name + " ranging from 0 to 10");
        for (int i = 0; i < size; i++) {
            set[i] = sc.nextInt();
        }
        return set;
    }

    public static void main(String[] args) {
        int[] count = new int[11];

        int[] universe = new int[] {
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
        };

        int[] A = askForSet("Set A");
        int[] B = askForSet("Set B");

        for (int i = 0; i < A.length; i++) {
            count[A[i]]++;
        }
        for (int i = 0; i < B.length; i++) {
            count[B[i]]++;
        }

        System.out.println();
        System.out.println("Union of Set A and Set B:");
        for (int i = 0; i < universe.length; i++) {
            if (count[i] > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Intersection of Set A and Set B:");
        for (int i = 0; i < universe.length; i++) {
            if (count[i] == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Complement of Set A and Set B:");
        for (int i = 0; i < universe.length; i++) {
            if (count[i] == 0) {
                System.out.print(i + " ");
            }
        }

    }

}