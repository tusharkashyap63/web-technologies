import java.util.HashSet;
import java.util.Scanner;

public class QuesFiveBetter {
    static HashSet < Integer > askForHashSet(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of " + name + " less than 11");
        int size = sc.nextInt();
        HashSet < Integer > set = new HashSet < > ();
        System.out.println("Enter elements of " + name + " ranging from 0 to 10");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            set.add(value);
        }
        return set;
    }

    static HashSet < Integer > Union(HashSet < Integer > A, HashSet < Integer > B) {
        HashSet < Integer > union = new HashSet < > ();

        for (int number: A) {
            union.add(number);

        }

        for (int number: B) {
            if (!A.contains(number)) {
                union.add(number);
            }
        }

        return union;

    }

    static void Intersection(HashSet < Integer > A, HashSet < Integer > B) {
        System.out.println("Intersection of A and B");

        for (int number: A) {
            if (B.contains(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

    }

    static void Complement(HashSet < Integer > universe, HashSet < Integer > A, HashSet < Integer > B) {
        System.out.println("Complement of A and B");

        HashSet < Integer > union = Union(A, B);

        for (int number: universe) {
            if (!union.contains(number)) {
                System.out.print(number + " ");
            }
        }

    }

    public static void main(String[] args) {
        HashSet < Integer > universe = new HashSet < > ();
        for (int i = 0; i <= 10; i++) {
            universe.add(i);
        }

        HashSet < Integer > A = askForHashSet("Set A");
        HashSet < Integer > B = askForHashSet("Set B");

        HashSet < Integer > union = Union(A, B);
        System.out.println("Union of A and B");
        for (int number: union) {
            System.out.print(number + " ");
        }
        System.out.println();
        Intersection(A, B);
        Complement(universe, A, B);

    }

}