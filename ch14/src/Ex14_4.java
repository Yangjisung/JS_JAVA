import java.util.*;

public class Ex14_4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		// list의 모든 요소를 출력
		System.out.print("forEach = ");
		list.forEach(i -> System.out.print(i +",")); //forEach
		System.out.println();
		
		//list에서 2 또는 3의 배수를 제거한다.
		list.removeIf(x-> x%2==0 || x%3==0); //  2의 배수 또는 3 배수
		System.out.println("removeIf = "+list);
		
		list.replaceAll(i -> i*10); // 모든요소를 변환하여 대체 ,== 모든요소에 *10
		System.out.println("replaceAll" + list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		// map의 모든요소를 {,v}의 형식으로 출력한다.
		map.forEach((k,v) -> System.out.print("{"+k+","+v+"},"));
		System.out.println();
	}

}
