package zoho;

public class AddRec {
	static int sum= 0;
	static int add(int i) {
		if(i<=5) {
			return i+add(i+1);
		}
		return 0;
//		System.out.println(sum);
	}
	public static void main(String[] args) {
		int i = 0;
		System.out.println(add(i));
	}
}
