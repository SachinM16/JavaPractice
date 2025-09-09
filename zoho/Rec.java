package zoho;

public class Rec {
	
	static int sub(int i) {
	
		if(i==0) {
			return i;
		}
		System.out.println(i);
		i--;
		sub(i);
		System.out.println(i);
		return i;
		
		
	}
	
	public static void main(String[] args) {
		int i = 10	;
		sub(i);
	}

}
