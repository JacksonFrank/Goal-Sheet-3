/*
 Jackson Frank
 Class: StringRepeater
 Purpose: To output an inputed string and inputed amount of times
 Pseudocode: 
 */

import java.util.Scanner;

public class StringRepeater {

	public static void main(String[] args) {
		System.out.println("String Repeater!");
		
		Scanner console = new Scanner(System.in);
		
		
		System.out.print("Your string: ");
		String phrase = console.nextLine();
		System.out.print("Amount of repeats: ");
		int repeats = console.nextInt();
		String repPhrase = repl(phrase, repeats);
		System.out.print(repPhrase);
		
		console.close();

	}
	public static String repl(String phrase, int repeats) {
		int arrayLength = 500; //TODO figure out Array lists
		
		String repPhrase;
		char array[] = phrase.toCharArray();
		char repArray[] = new char[arrayLength]; //TODO figure out Array lists so array doesn't have to be limited size
		int stringLength = phrase.length();
		if(repeats <= 0) {
			return "";
		}
		else if((repeats * stringLength) > arrayLength) { 
			return "Sorry! I need to figure out how to use array lists!";
		} //TODO figure out array lists
		else {	
			for(int i = 0; i <= repeats; i++) {
				for(int g = 0; g < stringLength; g++) {
					repArray[(i * stringLength) + g] = array[g];
				}
			}
			repPhrase = repArray.toString();
			return repPhrase;
		}
	
	}

}
