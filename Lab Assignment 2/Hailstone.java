import java.util.Scanner;

public class Hailstone {
	static int numOfSteps;
	
	static int HailstoneSequence(int n) {
		System.out.println(n);
		
		if(n == 1 && numOfSteps == 0) {
			return 0;
		} else if(n == 1 && numOfSteps != 0) {
			numOfSteps++;
			return numOfSteps;
		} else if(n % 2 != 0) {
			numOfSteps++;
			HailstoneSequence(3 * n + 1);
		} else {
			numOfSteps++;
			HailstoneSequence(n / 2);
		}
		return numOfSteps;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int x = sc.nextInt();
		sc.close();
		
		System.out.println("Number of Steps: " + HailstoneSequence(x));

	}

}
