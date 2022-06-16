
public class Ex4_10 { 
	// for문 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // sum 합계를 저장하기 위한 변수
		
		for (int i = 1 ; i <= 5; i++) {
			sum += i; // 복합대입연산자  sum = sum + i
			System.out.printf("1부터 %d 까지의 합: %d%n", i, sum);	
		}
		
	}

}
