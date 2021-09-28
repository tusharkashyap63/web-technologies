import java.util.Arrays;

public class ArraysQuesThree {
	
	static int calculateAverage(int a[]) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum / a.length; 
	}
	
	static void printSecondLargest(int a[]) {
		if(a.length < 2) {
			System.out.println("Array size too small");
		}
		
		Arrays.sort(a);
		
		for (int i = a.length - 2; i >= 0; i--)
		  {
		    if (a[i] != a[a.length - 1])
		    {
		     System.out.println("The second largest number is " + a[i]);
		      return;
		    }
		  }
	}
	
	static void printOdd(int a[]) {
		System.out.print("Odd Numbers: ");
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {23, 6, 47, 35, 2, 14};
		System.out.println("Average: " + calculateAverage(arr));
		printSecondLargest(arr);
		printOdd(arr);
	}

}
