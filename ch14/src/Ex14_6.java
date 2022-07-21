import java.io.File;
import java.util.stream.Stream;

public class Ex14_6 {
	public static void main(String[] args) {
		File[] fileArr= { new File("Ex1.java"),new File("Ex1.bak"),new File("Ex2.java"),new File("Ex1"),new File("Ex1.txt")};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		
		//
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 모든 파일 이름을 출력
		
		fileStream = Stream.of(fileArr); // 스트림다시생성
		
		fileStream.map(File::getName)  // Stream<File> >Strrea<File>
		          .filter (a -> a.indexOf(".") != -1) //filter 는 거른다.
		          // 확장자가 없는 것은 제외 // (indexOf가 -1이 아닌 fileStream 만 출력 // 따라서 new File("EX1")은 '.' 가 없기 때문에 indexOf를 적용시키면 -1이 반환됨.// -1 != -1 의 뜻은, -1이 아니라면 반환, 때문에 나머지 파일들만출력)
//		          .peek(a -> System.out.printf("filename=%s%n",a))
		          .map(a -> a.substring(a.indexOf('.')+1)) //s.indexOf('.')+1)
		          // == substring(4) == index[3]까지 자르기, index[3] == "Ex1."까지, 따라서 확장자이름 부분만 추출 
//		          .peek(a -> System.out.printf("extension=%s%n",a))
		          .map(String::toUpperCase)
		          .distinct() //중복제거
		          .forEach(System.out::println);
		
		
		   System.out.println();
	}

}
