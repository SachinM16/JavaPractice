package zoho;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class rmvchar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = sc.next();
		char c[]=input.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		 for(char ar:c) {
			 set.add(ar);
		 }
		 System.out.println(set);
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!='\0') {
//				for(int j=i+1;j<c.length;j++) {
//					if(c[i]==c[j]) {
//						c[j]='\0';
//					}
//				}
//				
//			}
//			
//		}
//		String result="";
//		System.out.println("String after removing duplicates:");
//		for(char ch : c) {
//			if(ch!='\0') {
//				result+= ch;
//			}
//		}
//		System.out.println(result);
		 
	}
}