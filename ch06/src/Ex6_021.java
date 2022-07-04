
public class Ex6_021 {
	public static int abs(int value) {
		return value >=0 ? value : -value; // 참일때 양수value : 거짓일때 -value
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));
	} // main
} // ex6_021



