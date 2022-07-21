import java.io.File;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Ex14_8 {
	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
//		Optional<Integer> optInt = optStr.map(s->s.length()); //람다식
		Optional<Integer> optInt = optStr.map(String::length); //메서드참조
		
		System.out.println("optStr=" + optStr.get());
		System.out.println("optStr=" + optInt.get());
		
		int result1 = Optional.of("123")
				.filter(x->x.length() > 0)
				.map(Integer::parseInt).get();
		
		int result2 = Optional.of("")
				.filter(x ->x.length() > 0) //false
				.map(Integer::parseInt).orElse(-1); // 벨류값이 없다면 -1을 반환해라
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		Optional.of("456").map(Integer::parseInt)
		.ifPresent(x -> System.out.printf("result3 = %d%n", x));
		
		OptionalInt optInt1 = OptionalInt.of(0);
		OptionalInt optInt2 = OptionalInt.empty();
		
		System.out.println(optInt1.isPresent()); //t
		System.out.println(optInt2.isPresent()); //f
		
		System.out.println(optInt1.getAsInt()); // 0
		System.out.println(optInt1.getAsInt()); // No suchElementException
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));

	} //main

}
