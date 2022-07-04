

public class Ex6_016 {
	
	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
	} // main
	
	public static void change(String str) {
		str += "456";
	}
} // ex6_016



