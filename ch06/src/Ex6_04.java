// 6-4번 getDistance()를 완성하시오.
public class Ex6_04 {
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));  
		//거리 계산공식
	}
	
	public static void main(String[] args) {
		System.out.println(getDistance(1, 1, 2, 2));
	} // main
} // ex6_04

