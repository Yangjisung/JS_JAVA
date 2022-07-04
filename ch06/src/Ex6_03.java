// 6-3번 getTotal(), getAverage() 를 추가하시오 (매개변수 없음.)
public class Ex6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 s = new student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	} // main
} // ex6_03
class student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	public float getAverage() {
		float aver = (float)(getTotal()) / 3; // aver = 78.6666..7
		return (float)(Math.round(aver*10)/10.0); // aver * 10 = 786.666..7 -> 787.0 / 10.0 = 78.7
	}
} // student2

