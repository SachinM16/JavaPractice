package zoho;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		String Numbers = "1234567890";
		String Alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Special = "/@#$&*";
		List<Character> add = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n,a,s;
		System.out.println("Enter the count of numbers:");
		n=sc.nextInt();
		System.out.println("Enter the number of alphabets:");
		a=sc.nextInt();
		System.out.println("Enter the number of special characters:");
		s=sc.nextInt();
		SecureRandom r = new SecureRandom();
		for(int i = 0; i<n;i++) {
			add.add(Numbers.charAt(r.nextInt(Numbers.length())));
		}
		for(int j = 0; j<a;j++) {
			add.add(Alpha.charAt(r.nextInt(Alpha.length())));
		}
		for(int k = 0; k <s;k++) {
			add.add(Special.charAt(r.nextInt(Special.length())));
		}
		Collections.shuffle(add);
		String fin ="";
		for(char pr:add) {
			fin+= pr;
			
		}
		System.out.println(fin);
		
		
				
	}

}
