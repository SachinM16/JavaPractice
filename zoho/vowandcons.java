package zoho;

import java.util.Scanner;

public class vowandcons {
	public static void main(String[] args) {
		int vowels=0,cons=0,dig=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words:");
        String line = sc.nextLine();
        String[] words = line.split(" "); 
        for(int i =0;i<words.length;i++) {
        	for(int j=0;j<words[i].length();j++) {
        		char c = words[i].charAt(j);
        		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
        			vowels++;
        		}
        		else if((c>='a' && c<='z')||(c>='A'&&c<='Z')){
        			cons++;        			
        		}
        		else if(c>='0'&&c<='9') {
        			dig++;
        		}
        	}
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consanants:"+cons);
        System.out.println("Numbers:"+dig);
	}

}
