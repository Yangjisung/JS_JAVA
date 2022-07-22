import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice_5 {
	public static void main(String[] args) {
		
		String[] strArr = { "aaa","bb","c", "dddd" }; // 배열선언
		
		Stream<String> strStream = Stream.of(strArr);//<String>타입 스트림 strStream 생성
		
     // int sum = strStream.mapToInt(s-> s.length()).sum(); //람다식
		int sum = strStream.mapToInt(String::length).sum(); // 메서드참조
		//mapToint: 스트림을 intStream으로 변환해주는 메서드, intStream에 있는 sum() 메서드사용
		System.out.println("sum="+sum); // "aaa" =3 , "bb"=2, "c"=1, "dddd"= 4 

			} //main
}

