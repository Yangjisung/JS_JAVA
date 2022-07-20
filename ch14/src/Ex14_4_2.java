import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_4_2 {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); // Stream 생성
//		intStream.forEach(System.out::print); // forEach()최종연산
//		
//		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream은 닫힌다.
//		intStream = list.stream(); // list로 부터 stream 생성
//		intStream.forEach(System.out::print);
		
		//스트림 만들기 배열
		
		Stream<String> strStream = Stream.of("가변인자 문자열 스트림:" + "a", "b", "c"); // 가변인자가 있는 문자열 스트림 생성
		
		String[] strArr = new String[] {"문자열 배열 스트림:" + "a", "b", "c","d"};
		Stream<String> strStream2 = Stream.of(strArr); // 또는 Stream<String> strStream2 = Arrays.stream(strArr); 로 쓸 수 있음. 
		//19,20번 줄을 1줄로 표현할때 -> 22번줄
//		Stream<String> strStream2 = Stream.of(new String[] {"문자열 배열 스트림:" + "a", "b", "c","d"}); // 문자열배열 스트림 생성
		
		strStream.forEach(System.out::print); // 람다식을 매개변수로 하는 strStream 스트림의 forEach() 최종연산
		System.out.println();
		strStream2.forEach(System.out::print); // 람다식을 매개변수로 하는 strStream2 스트림의 forEach() 최종연산
		System.out.println();
		
		//IntStream : 기본형 스트림
//		int[] intArr = {1,2,3,4,5};
//		IntStream intStream = Arrays.stream(intArr); // 
//		intStream.forEach(System.out::println);
//		System.out.println("count="+ intStream.count()); // 최종연산
//		System.out.println("sum=" + intStream.sum()); 
//		System.out.println("average=" + intStream.average());
		
//		//Stream<Integer> : 객체형 스트림 ; Stream<T>는 숫자외에도 여러타입의 스트림이 가능해야하므로 숫자 스트림에만 사용할 수 있는 sum(), average()를 넣지 않은 것.
		Integer[] intArr = {1,2,3,4,5};
		Stream<Integer> intStream = Arrays.stream(intArr);
		intStream.forEach(System.out::println);
//		System.out.println("sum=" + intStream.sum()); // 연산x, count()만 가능
		
	}//main
}
