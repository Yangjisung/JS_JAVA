// 연습문제 6-1번, 6-2번
public class Ex6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	} // main
} // ex6_02

class Student {
	String name;
	int no;
	int ban;
	int kor;
	int eng;
	int math;
	
	Student(String name, int grade, int ban, int kor, int eng, int math) {
		this.name = name;
		this.no = grade;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int sum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	double average(int kor, int eng, int math) {
		float aver = (float)(kor + eng + math) / 3;
		return  Math.round(aver*10)/10.0;
	}
	String info() {
		return name +","+ no +","+ ban +","+ kor +","+ eng +","+ math +","+ sum(kor, eng, math) +","+ average(kor, eng, math)  ;
	}
} //student
