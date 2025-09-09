package zoho;

public class PascalsTriangle {

	    public static void main(String[] args) {
	        int rows = 5; // You can change this value to print more rows

	        System.out.println("Pascal's Triangle with " + rows + " rows:");

	        for (int i = 0; i < rows; i++) {
	            // Print spaces for alignment
	            for (int space = 0; space < rows - i; space++) {
	                System.out.print(" ");
	            }

	            int number = 1; // First number in each row is always 1
	            for (int j = 0; j <= i; j++) {
	                System.out.print(number + " ");

	                // Formula to calculate next value in the row:
	                // number = number * (i - j) / (j + 1)
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println(); // New line after each row
	        }
	    }
	}


