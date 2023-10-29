import java.util.Scanner;
import java.util.Arrays;

public class Math01{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Starting Number: ");
		int start = scan.nextInt();
		System.out.println("Enter Ending Number: ");
		int end = scan.nextInt();

		EvenOddMethods object1 = new EvenOddMethods(start, end);


		System.out.println(object1.countEven());
		System.out.println(object1.countOdd());

		int[] evenNumbers = object1.genEven();
		System.out.println("List of even Numbers: " + Arrays.toString(evenNumbers));

		int[] oddNumbers = object1.genOdd();
		System.out.println("List of odd Numbers: " + Arrays.toString(oddNumbers));

		System.out.println("Has Even Number: " + EvenOddMethods.hasEvenNumber(evenNumbers));
        System.out.println("Is 4 Even? " + EvenOddMethods.isEven(4));
        System.out.println("Has Odd Number: " + EvenOddMethods.hasOddNumber(oddNumbers));
        System.out.println("Is 7 Odd? " + EvenOddMethods.isOdd(7));

        System.out.println("Has Even Number: " + EvenOddMethods.hasEvenNumber(oddNumbers));
		System.out.println("Is 3 Even? " + EvenOddMethods.isEven(3));
		System.out.println("Has Odd Number: " + EvenOddMethods.hasOddNumber(evenNumbers));
		System.out.println("Is 8 Odd? " + EvenOddMethods.isOdd(8));


	}
}