import java.util.*;
import java.text.*;

public class Ex10_plactice_4 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2000, 0, 1);
		date2.set(2016, 0, 29);
		System.out.println("변환 이전 :" + date2);
		System.out.println("변환 이전 :" + date1);
		
		System.out.println("---------------------------");
		
		SimpleDateFormat df = new SimpleDateFormat ("yyyy - MM - dd");
		System.out.println("생일 = " + df.format(new Date(date1.getTimeInMillis())));
		System.out.println("오늘 날짜 = " + df.format(new Date(date2.getTimeInMillis())));
		
		long differece_day = ((date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000);
		
		System.out.println(differece_day + "초");
		System.out.println(differece_day/(24*60*60) + "일");
		
		
		}
	}