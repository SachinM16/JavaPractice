package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second word: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(Arrays.equals(arr1, arr2))
        		{
        	System.out.println("Anagram");
        }
        else {
        	System.out.println("Not anagram");
        }
//        for (int i = 0; i < arr1.length - 1; i++) {
//            for (int j = 0; j < arr1.length - i - 1; j++) {
//                if (arr1[j] > arr1[j + 1]) {
//                    char temp = arr1[j];
//                    arr1[j] = arr1[j + 1];
//                    arr1[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr2.length - 1; i++) {
//            for (int j = 0; j < arr2.length - i - 1; j++) {
//                if (arr2[j] > arr2[j + 1]) {
//                    char temp = arr2[j];
//                    arr2[j] = arr2[j + 1];
//                    arr2[j + 1] = temp;
//                }
//            }
//        }
//        boolean isAnagram = true;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) {
//                isAnagram = false;
//                break;
//            }
//        }
//        if (isAnagram) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }
        sc.close();
    }
}
