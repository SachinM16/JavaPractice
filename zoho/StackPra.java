package zoho;

import java.util.Stack;

public class StackPra {
	public static void main(String[] args) {
		Stack<String> data = new Stack<>();
		data.push("Sachin");
		data.push("Sibi K");
		System.out.println(data.pop());
		if(data.isEmpty()) {
			System.out.println("Have data");
		}
		else {
			System.out.println("NOT");
		}
		System.out.println(data.peek());
		
	}

}
