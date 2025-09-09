package Placement;

import java.util.Scanner;

public class Q05_AreaVolumeSphere {
	
	/**
	 *  This program calculates the Volume and Surface Area of a sphere 
	 *  using the following formulas:
			Volume (V) = (4/3) × π × r³
			Area (A) = 4 × π × r²
	
	Problem Flow:
	Get r (radius) from user
	Calculate area using A = 4πr²
	Calculate volume using V = (4/3)πr³
	Display both values
	
	 Input / Output Example:
	Input:
	Enter Radius of Sphere: 7
	Output:
	Volume of Sphere: 1436.571429
	Area of Sphere  : 615.428571
	
	 */
	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius:");
		r = sc.nextInt();
		double a, v;
		v = (4.0/3.0)*Math.PI*Math.pow(r, 3);
		a = 4 *Math.PI*Math.pow(r, 2);
		System.out.println("Volume of Sphere:"+v);
		System.out.println("Area of Sphere:"+a);
	}

}
