import java.util.function.*;

public class Ex14_3 {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); //i -> i >= 100;
		
		Predicate<Integer> all = notP.and(q.or(r)); // i >= 100 && (i < 200 || (i%2 ==0)) , 100이상(참) 그리고 200미만(참) 이거나 2의배수(참) = all
		System.out.println(all.test(150)); // 100이상(참) 그리고 200미만(참) 이거나 2의 배수(참) = ture
		
		String str1 = "abc";
		String str2 = "abc";
		
		// str1 과 str2가 같은지 비교한 결과 반환
		
		Predicate<String> p2 = Predicate.isEqual(str1); // 문자열 
		boolean result = p2.test(str2);
		System.out.println(result);
	} // main
}
