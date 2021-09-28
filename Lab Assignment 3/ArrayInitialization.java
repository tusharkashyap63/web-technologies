import java.util.Scanner;

public class ArrayInitialization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int arrSize = sc.nextInt();
		
		int[] arr = new int[arrSize];
		
		System.out.println("Enter elements");
		for(int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.print("Array: ");
		for(int i = 0; i < arrSize; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
