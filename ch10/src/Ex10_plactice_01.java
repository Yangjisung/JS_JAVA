import java.util.*;
import java.text.*;

public class Ex10_plactice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar day = Calendar.getInstance(); //Calendar 클래스(추상) 생성
		day.set(2020, 0, 1); // set 메서드 활용하여 2020년 1월 1일로 지정 

		for(int i=0; i < 12; i++) {
			int weekday = day.get(Calendar.DAY_OF_WEEK); // 2020년 1월 1일의 요일을 구한다.(=수요일(4))
			
			int secondSunday = (weekday==1) ? 8 : 16 - weekday; 
			
			day.set(Calendar.DAY_OF_MONTH, secondSunday); // DAY_OF_MONTH: 이달의 몇일,
//			System.out.println(day.getTime());
			
			Date d = day.getTime(); // Calendar 를 Date로 변환한다.
			System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일 입니다.").format(d));
			// SimpleDateFormat 클래스의 format 메서드
			
			day.add(Calendar.MONTH,1); //해당 날짜의 월에 1+
			day.set(Calendar.DAY_OF_MONTH,1); // 해당 달의 몇일

		}
	}

}
