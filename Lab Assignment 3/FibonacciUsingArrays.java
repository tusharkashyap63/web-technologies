import java.util.Scanner;

class FibonacciUsingArrays {
    static int fib(int n) {
        int fib[] = new int[n + 2];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();
        System.out.println(fib(num));
    }
}