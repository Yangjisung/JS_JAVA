//s
public class Ex6_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
	} // main
} // ex6_02

class Student {
	String name;
	int grade;
	int club;
	int kor;
	int eng;
	int math;
	
	Student(String name, int grade, int club, int kor, int eng, int math) {
		this.name = name;
		this.grade = grade;
		this.club = club;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int sum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	public double average(int kor, int eng, int math) {
		float aver = (float)(kor + eng + math) / 3;
		return  Math.round(aver*10)/10.0;
	}
	public String info() {
		return name +","+ grade +","+ club +","+ kor +","+ eng +","+ math +","+ sum(kor, eng, math) +","+ average(kor, eng, math)  ;
	}
} //student
