// 연슴문제6. 6-4에 작성한 클래스 메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
class MyPoint {
	int x; 
	int y;
	// 인스턴스 변수
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance (int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
	}
	
}

public class Ex6_06 {
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2,2));
	} // main
} // ex6_06



