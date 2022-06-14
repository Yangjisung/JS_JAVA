
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15); // 10 진수 
		System.out.printf("%o%n", 15); // 8 진수 
		System.out.printf("%x%n", 15); // 16 진수
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 2진수 문자열
		
		//실수
		double f = 123.456789; // float & double
		System.out.printf("%f%n", f); //실수
		System.out.printf("%e%n", f); //지수
		System.out.printf("%g%n", f); //소수점을 포함한 7자리를 표현
		
		//출력값 조절
		System.out.printf("[%5d]%n",10);  // 5자리 수로 표현
		System.out.printf("[%-5d]%n",10); // 왼쪽 정렬
		System.out.printf("[%05d]%n",10); // 공백에 '0'으로 채움
		
		double d = 1.23456789;
		System.out.printf("%f%n", d);
		System.out.printf("%14.10f%n", d);
		
		//문자열 지시자
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%-10s]%n","www.codechobo.com");
	}

}
