package zoho;

public class strcls {
	public static void main(String[] args) {
	String str="Chennai";
	String str1= new String("Chennai");
	String str2=new String("Chennai");
//	if(str!=str1) {
//		System.out.println("True");
//	}

	System.out.println(str.equals(str1));
	String str3 = str1.intern();
	System.out.println(str==str3);
}
}
