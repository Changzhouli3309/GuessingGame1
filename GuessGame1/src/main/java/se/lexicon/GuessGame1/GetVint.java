package se.lexicon.GuessGame1;

import java.util.Scanner;
//Check the string is number or not, until you get a valid number
public class GetVint {
	private static Scanner scan= new Scanner(System.in);
	
	public static int g() {
    	boolean valid = false;
    	int number = 0;
    	while(!valid) {
    		try {
        		number =Integer.parseInt(scan.nextLine());
        		valid = true;
        	}catch(NumberFormatException e) {
        		System.out.println("You did not enter a valid number");
        	}
    	}
    	return number;    	
    }
}
