package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        sentence=sc.nextLine();
        String[] words = sentence.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];  
            if (i > 0) {
                reversed += " ";   
            }
        }
        System.out.println(Arrays.toString(words));
        System.out.println("Reversed: " + reversed);
    }
}
