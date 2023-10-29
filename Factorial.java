import java.util.Scanner;

public class Factorial{
	public static void main (String[] args){
		int num = 0;

		System.out.println("Enter a non-negative integer: "); 

		Scanner scanner = new Scanner(System.in);

		num = scanner.nextInt();

		if (num < 0){
			System.out.println("Invalid number");
			System.exit(0);
		}

		int factorial = 1; 

		for (int i = 2; i <= num; i++){
			factorial = factorial * i;
		}

		System.out.println("Factorial: " + factorial);




	}


}