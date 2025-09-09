package zoho;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        double temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is armstrong or not:");
        int num = sc.nextInt();
        int count = 0;
        int tempNum = num;
        while (tempNum != 0) {
            tempNum = tempNum / 10;
            count++;
        }
        tempNum = num;
        while (tempNum != 0) {
            int dig = tempNum % 10;
            temp += Math.pow(dig, count);
            tempNum = tempNum / 10;
        }
        if (num == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
