import java.util.function.Function;

public class Ex14_4_1 {
	public static void main(String[] args) {
	// Supplier는 입력 x, 출력o
//	Supplier<MyClass> s = () -> new MyClass(); // 람다식
//	Supplier<MyClass> s = MyClass::new; // 메서드 참조
		
		
		// Supplier 를 사용할때
//		MyClass mc = s.get();
//		System.out.println(mc); // get : Supplier 가 만든객체를 반환.
		
		
	//Function는 입력o, 츨력o
//	Function<Integer, MyClass> f = (i) -> new MyClass(i); // 람다식
	Function<Integer, MyClass> f = MyClass::new; // 메서드 참조
	
	MyClass mc2 = f.apply(100); // get 이 아닌 apply메서드 사용 매개변수 "100" 입력
	System.out.println(mc2.iv);
	
	// 위 식을 한줄로 표한하면, 
	System.out.println(f.apply(200).iv);
	
	
	//배열 생성 (배열의 생성은 Function으로 생성) ?: 배열의 생성에서는 길이를 줘야하기때문에 입출력이 가능한 Function 사용
//	Function<Integer, int[]> f2 = (i) -> new int[i]; // 람다식을 활용한 배열 생성
	Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
	int[] arr = f2.apply(100); // 길이가 100인 arr 배열 생성
	
	System.out.println("arr.length = " + arr.length); // arr배열 길이 출력 
//	System.out.println(f2.apply(100).length); // 길이가 100인 f2 배열의 길이 출력 
	
	}// main
}

class MyClass {
	int iv; // 지역변수
	
	MyClass(int iv) { //생성자
		 this.iv =iv;
	}
}
