/*
	This program identifies missingMismatched brackets	
	Author : Siphosethu Shumani
	Date : 15 March 2022
*/

import java.util.Scanner;
import java.util.Stack;

// things you may want to do
// function that checks if a bracket is an opening or closing bracket
// function that returns a corresponding bracket to a given bracket

public class Question2 {
	public static boolean isOpening(char c){
		/*  given a character returns true if its an opening bracket 
		else retuns false*/
		char[] openingBraces = {'{','[','(','<'};

		for(int i=0; i<openingBraces.length; i++){
			if(c == openingBraces[i]) return true;
		}
		return false;
	}

	public static boolean isMatching(char c, Stack<Character> stack){
	 /* given a closing brace, retuns true if there's a corresponding brace at the peek 
	 else return false*/
		if(c == '}' && stack.peek() == '{'){
			return true;	
		}
		else if(c == '>' && stack.peek() == '<'){
			return true;	
		}
		else if(c == ')' && stack.peek() == '('){
			return true;	
		}
		else if(c == ']' && stack.peek() == '[') {
			return true;	
		}
		return false;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a string to test: %n");
		char[] openingBraces = {'{','[','(','<'};
		Stack<Character> braceStack = new Stack<Character>();

		// last opening brace should always match with last item of stack
		// remove opening brace after matching it
		String line = input.nextLine().replaceAll(" ","");
		boolean missingMismatch = false;

		for(int i=0; i<line.length(); i++){
			if(isOpening(line.charAt(i))){ // adding opening braces to the stack
				braceStack.push(line.charAt(i));
				//System.out.printf("adding an opening brace %n");
			}
			else if(braceStack.isEmpty() && !isOpening(line.charAt(i))){
				System.out.printf("error at end: the close bracket '%c' does not have a corresponding opening bracket.%n",line.charAt(i));
				missingMismatch = true;
				//System.out.printf("There are no match for closing %n");
			}
			else if(!isMatching(line.charAt(i), braceStack)) {
				System.out.printf("error: '%c' does not match with '%c'. %n",line.charAt(i), braceStack.peek());
				missingMismatch = true;
				break;
			}
			else if(!braceStack.isEmpty() && isMatching(line.charAt(i), braceStack)) {
				braceStack.pop();
				//System.out.printf("removing an opening brace %n");
			}
			else continue;
		}

		if(missingMismatch != true){
			if(braceStack.isEmpty()) System.out.printf("There string is correct! There are no missingMismatched brackets. %n");
			else {
				while(!braceStack.isEmpty()){
					System.out.printf("error at end: opening bracket '%c' remains unclosed.%n",braceStack.peek());
					braceStack.pop();
				}
			}
		}
	}
}
