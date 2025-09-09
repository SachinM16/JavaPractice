package zoho;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		String arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		arr = sc.next();
		String rev="";
		for(int i = arr.length()-1;i>=0;i--) {
			rev+=arr.charAt(i);
		}
		System.out.println(rev);
		if(arr.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NOT");
		}
	
	}
	

}
