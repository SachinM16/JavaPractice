package Placement;

import java.util.Scanner;

public class Q18_StringReverse {
	
	/**
	 *  This program takes a string (text) and creates its reverse 
	 version in another string (reverseText). Each character from the 
	 original string is added in reverse order to the new string.
	 
	 Flow Summary
	Read the input string
	Loop from last character to first
	Use comma operator in loop (i--, j++)
	Add each character to reverseText
	Print the reversed output
	
	Sample I/O
	Input:
	Enter the string below:
	hello
	Output:
	Reversed Text: olleh

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str,rev="";
		System.out.println("Enter the string:");
		str = sc.next();
		for(int i = str.length()-1; i>=0;i-- ) {
			rev+=str.charAt(i);
		}
		System.out.println(rev);
	}

}
