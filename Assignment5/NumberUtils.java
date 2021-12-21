import java.util.Arrays;

public class NumberUtils {
	// instance
	
	// Constructor 
	private NumberUtils() {}

	// methods
	public static int[] toArray(int number) {
		// get the number
		// convert number to string 
		// make an int array
		// for each character, convert to int and put into array

		String numString = Integer.toString(number);
		int[] numArray = new int[numString.length()];

		for(int i=0; i< numArray.length; i++) {
			int toInt = Character.getNumericValue(numString.charAt(i));
			numArray[i] = toInt;
		}

		return numArray;
	}

	public static int countMatch(int numberA, int numberB) {
		// make a var for the matches
		// use toArray to convert to array
		// use a for loop to compare the numbers
		// return the matches
		
		int numMatches = 0;
		
		// making the arrays from the numbers
		int[] arrA = toArray(numberA);
		int[] arrB = toArray(numberB);
		
		// comparing the digits
		for(int i=0; i< arrA.length ; i++) {

			if(arrA[i] == arrB[i]) { // doing a comparison for similar digits
				numMatches++;
			}

		}

	 	return numMatches;
	}	



	public static int countIntersect(int numberA, int numberB) {
		// Count the quantity of digits that two numbers have in common, regardless of position.
		// For example, given 39628 and 97324, there are 3 digits in common: 3, 7, 2.
		// It is assumed that the numbers are the same length and have no repeating digits.
	
		int numIntersect = 0;
		
		// making the arrays from the numbers
		int[] arrA = toArray(numberA);
		int[] arrB = toArray(numberB);

		for(int num1 : arrA) {
			
			for(int num2 : arrB) {
				
				if(num1 == num2) {
					numIntersect++;
				}
			}
		}

		return numIntersect;
	}
	
	// the main method is for testing the functions
	public static void main(String[] args) {
		int count = countIntersect(39628, 97324);
		System.out.println("There are " + count + "  digits in common");
	}

}
