import java.util.Scanner;
import java.util.ArrayList;

class EvenOddMethods{

	private int start;
	private int end; 

    public EvenOddMethods(int start, int end) {
    	this.start = start;
    	this.end = end;
    }

	/**
     * Counts and returns the number of even integers in the specified range.
     * @return A string with the even count.
     */

	public String countEven(){
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
     * @return A string with the odd count.
     */

	public String countOdd(){
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
     * @return An array filled with even numbers
     */

	public int[] genEven(){

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

	/**
     * Generates and returns an array filled with odd numbers
     * @return An array filled with odd numbers
     */

	public int[] genOdd(){

		//Initializing array list and adding odd numbers in. 
		ArrayList<Integer> oddNumbersList = new ArrayList<>();

		for (int i = start; i <= end; i++){
			if (i % 2 != 0){
				oddNumbersList.add(i);
			}
		}


		//Converting list to array
		int[] oddNumbersArray = new int[oddNumbersList.size()];	
		for (int i = 0; i < oddNumbersList.size(); i++){
			oddNumbersArray[i] = oddNumbersList.get(i);
		}

		return oddNumbersArray;
	}

	/**
	 * Checks if a given integer is even.
	 * @return True if the input number is even; otherwise, false.
	 */

	public static boolean isEven(int num){
		boolean result = false;
		if (num % 2 == 0){
			result = true;
		}

		return result; 
	}

	/**
	 * Checks if there is at least one even number in the given array.
	 *
	 * @param numbers An array of integers to check.
	 * @return True if at least one even number is found; otherwise, false.
	 */

	public static boolean hasEvenNumber(int[] numbers){
		boolean result = false; 

		for (int num : numbers){
			if (isEven(num)){
				result = true;
				break;
			}
		}

		return result;
	}

	/**
	 * Checks if a given integer is odd.
	 *
	 * @param num The integer to be checked for oddness.
	 * @return True if the input number is odd; otherwise, false.
	 */

	public static boolean isOdd(int num) {
	    return num % 2 != 0;
	}

	/**
	 * Checks if there is at least one odd number in the given array.
	 *
	 * @param numbers An array of integers to check.
	 * @return True if at least one odd number is found; otherwise, false.
	 */

	public static boolean hasOddNumber(int[] numbers){
		boolean result = false;

		for (int num : numbers){
			if (isOdd(num)){
				result = true;
				break;
			}
		}

		return result;
	}
}