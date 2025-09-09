package zoho;

import java.util.Scanner;

public class ReverseWordinSentence {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence:");
		String user = sc.nextLine();
		String reversed ="";
		for(int i = user.length()-1;i>=0;i--) {
			reversed = reversed + user.charAt(i);
		}
		System.out.println(reversed);
	}

}
