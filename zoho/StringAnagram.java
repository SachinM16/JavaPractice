package zoho;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		char str1[]= {'s','i','r'};
		char str2[]= {'i','r','s'};
		
		int n = str1.length;
		int n1 =str2.length;
		
		if(n!=n1) {
			System.out.println("Not Anagram");
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("Not");
		}
				
	}

}
