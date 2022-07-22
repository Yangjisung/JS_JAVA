import java.util.Random;

public class Practice_7 {
	public static void main(String[] args) {
			new Random().ints(1,46) // 1~45사이의 정수 (46은 포함안됨)
			// Random클래스 ints 메서드는 지정된 범위내의 임의의 정수를 요소로하는 무한스트림을 반환함.
			.distinct() // 중복제거
			.limit(6) // 6개만
			.sorted() // 정렬
			.forEach(System.out::println); // 화면에 출력
		}//main
}

