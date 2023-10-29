import java.util.Scanner;

public class countEvenOdd{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		// Prompt user for input	
		System.out.println("Please enter a starting number: ");
		int start = scanner.nextInt();

		System.out.println("Please enter an ending number: ");
		int end = scanner.nextInt();

		countEven(start, end);

		countEven(start, end);
	}

	public static int countEven(int start, int end){
		System.out.println("Even works");
	}

	public static int countOdd(int start, int end){
		System.out.println("Odd works");
	}
}