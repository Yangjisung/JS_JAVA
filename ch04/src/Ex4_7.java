
public class Ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		// 괄호안{}에 내용을 10번 반복한다.
		// Q1. 1~10 사이의 난수 20개를 출력
		// 1,2,3,4,5,6,7,8,9,10
		// Q2. -5~5 사이의 난수 20개를 출력
		// -5 -4 -3 -2 -1 0 1 2 3 4 5 (11개)
		for (int i = 1; i <= 20; i++) {
//		System.out.println(Math.random()); // 0.0 <=x < 1.0
//		System.out.println(Math.random()*10); //0.0 <= x < 10.0, 0~ 9.9
//		System.out.println((int) (Math.random()*10)); //0 <= x < 10, 0~9
		System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6, -5~5
	}

 }
}
