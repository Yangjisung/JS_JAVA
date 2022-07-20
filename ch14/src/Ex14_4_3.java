import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_4_3 {
	public static void main(String[] args) {
	//임이의 수 스트림 예제
//	IntStream intStream = new Random().ints(); // 무한스트림
//	IntStream intStream = new Random().ints(5); // ints 갯수제한
//	IntStream intStream = new Random().ints(5, 10;); // 범위 from ~ to 5 ~ 10미만
//	intStream
//	.limit(5) 
//	.forEach(System.out::print);

	//	iterate 스트림 예제 :              iterate(시드값(초기값), 람다식)
	Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
	intStream.limit(10).forEach(System.out::println);
	
	// generate 스트림 예쩨
	Stream<Integer> oneStream = Stream.generate(() -> 1);
	oneStream.limit(5).forEach(System.out::println);
	}//main
}
