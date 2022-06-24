
public class Ex6_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		junyp s = new junyp();
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§ : " + s.name);
		System.out.println("ÃÑÁ¡ : " + s.getTotal());
		System.out.println("Æò±Õ : " + s.getAverage());
	} // main
} // ex6_03
class junyp {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	public float getAverage( ) {
		float aver = (float)(kor + eng + math) /3;
		return (float)(Math.round(aver*10)/10.0);
	}
} // ÁØ¿±

