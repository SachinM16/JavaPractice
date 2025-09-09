package zoho;

import java.util.Scanner;

public class GCDandLCM {
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        int gcd = findGCD(a, b);
	        int lcm = (a * b) / gcd;   // using relation

	        System.out.println(gcd);
	        System.out.println(lcm);
	    }

	    // Euclidean algorithm
	    static int findGCD(int x, int y) 
	    {
	        while (y != 0) 
	        {
	            int temp = y;
	            y = x % y;
	            x = temp;
	        }
	        return x;
	    }
	


}
