package zoho;

import java.util.Scanner;
import java.util.Stack;

public class balbra {
	public static boolean isBalance (String expr) {
		Stack<Character> stack=new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brackets:");
		String str = sc.next();
		for(char c:str.toCharArray()) 
		{
			if("[{(".indexOf(c)!= -1) 
			{
				stack.push(c);
			}
			else if(c==')'||c=='}'||c==']')
			{
//				if(stack.empty()) 
//				{
//					System.out.println("Not Balanced");
//					return false;
//				}
				char cs = stack.pop();
				if(c=='['&&cs!=']' || c=='{' &&  cs!='}'|| c=='(' && cs!=')' )
				{
					return true;
				}
			}
		}
		return stack.isEmpty();
	}
		public static void main(String[] args) {
			System.out.println(isBalance("[({})]"));
	}
}
