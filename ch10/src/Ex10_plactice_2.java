import java.util.*;
import java.text.*;

public class Ex10_plactice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일 입니다."; // 'E'는 일~토 중 하나의 요일이 출력
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("날짜를" + pattern + "의 형태로 입력해 주세요.(입력예:2017/05/11)");
			
			try {
				System.out.println("->");
				inDate = df.parse(s.nextLine()) ;
				System.out.println("parse메서드( pattern 형식 문자열 -> date) 변환 후: "+inDate);
				//입력받은 날짜(문자열)를 Date로 변환 (문자열소스를 Date인스턴스로)
				break; // parse()에서 예외가 발생하면 이 문장은 수행x
			} catch(Exception e) {
				System.out.println("예외 발생: 형식이 잘못 되었습니다. 다시 입력해주세요.");
			}
		} while(true);
		
		System.out.println( "format메서드(date -> pattern2 형식 문자열) 변환 후 : "+ df2.format(inDate));
		
		}
	}