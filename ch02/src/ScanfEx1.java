import java.util.*; //1. import문 추가

public class ScanfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //2. Scanner 클래스의 객체생성
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		//3. 화면에서 입력받은 정수를 num에 저장.
		System.out.println(num);
		System.out.println(num2);
	}

}
