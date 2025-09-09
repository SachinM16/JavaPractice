package Placement;

import java.util.Scanner;

public class Q07_SimpleStringEncoding {
	
	/**
	 * This program reads a five-letter word from the user and encodes 
	 it by subtracting 1 from the ASCII value of each character. 
	 It then prints the newly encoded word.
	 
	 Problem Flow:
	Get 5-letter word input
	Loop each character → subtract 1 from ASCII
	Build new string with changed characters
	Print encoded result
	
	Input / Output Example:
	Input:
	Enter a Five letter word: white
	Output:
	Encoded Word: vghsd
	 */
	public static void main(String[] args) {
		String input = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a five-letter word: ");
		input = scanner.nextLine();
        if (input.length() != 5) {
            System.out.println("Error: Please enter exactly five letters.");
            return;
        }
        String encoded ="";
        for (int i = 0; i < input.length(); i++) {
            char originalChar = input.charAt(i);
            char encodedChar = (char)(originalChar - 1);
            encoded = encoded + encodedChar; 
        }
        System.out.println("Encoded Word: " + encoded);	
	}

}
