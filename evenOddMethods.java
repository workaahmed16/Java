import java.util.Scanner;
import java.util.ArrayList;

class EvenOddMethods{

	/**
     * Counts and returns the number of even integers in the specified range.
     *
     * @param start The start of the range (inclusive).
     * @param end   The end of the range (inclusive).
     * @return A string with the even count.
     */

	public static String countEven(int start, int end){
		int counter = 0;
		for (int i = start; i <= end; i++){
			if (i % 2 == 0){
				counter++;
			}
		}

		
		return "Even Count: " + counter;
	}


 	/**
     * Counts and returns the number of odd integers in the specified range.
     *
     * @param start The start of the range (inclusive).
     * @param end   The end of the range (inclusive).
     * @return A string with the odd count.
     */

	public static String countOdd(int start, int end){
		int counter = 0;
		for (int i = start; i <= end; i++){
			if (i % 2 != 0){
				counter++;
			}
		}
		
		return "Odd Count: " + counter;
	}

	/**
     * Generates and returns an array filled with even numbers
     *
     * @param start The start of the range (inclusive).
     * @param end   The end of the range (inclusive).
     * @return An array filled with even numbers
     */

	public static int[] genEven(int start, int end){

		//Initializing array list and adding even numbers in. 
		ArrayList<Integer> evenNumbersList = new ArrayList<>();

		for (int i = start; i <= end; i++){
			if (i % 2 == 0){
				evenNumbersList.add(i);
			}
		}


		//Converting list to array
		int[] evenNumbersArray = new int[evenNumbersList.size()];	
		for (int i = 0; i < evenNumbersList.size(); i++){
			evenNumbersArray[i] = evenNumbersList.get(i);
		}

		return evenNumbersArray;
	}
}