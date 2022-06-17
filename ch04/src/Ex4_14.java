
public class Ex4_14 { 
	// while문 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		while(sum<=100) { 
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i; // sum = sum + (++i)
		}
	} // main의 끝.
}