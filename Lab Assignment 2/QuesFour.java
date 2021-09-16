import java.util.Scanner;

public class QuesFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        long N = sc.nextLong();
        sc.close();
        long sum = 0;
        for (long i = 0; i <= N; i++) {
            sum += i;
        }
        if (N * N != sum) {
            System.out.println("No this value does not satisfy the condition");
            System.out.println("Σi is " + sum + "" + " and i^2 is " + N * N);
        } else {
            System.out.println("Yes this value satisfy the condition");
            System.out.println("Σi is " + sum + " " + " and i^2 is " + N * N);
        }

    }

}