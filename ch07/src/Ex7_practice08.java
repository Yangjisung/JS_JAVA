class Outer3 {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value); //외부클래스이름.this.변수이름
		} //method
	} //Inner
}// outer3
public class Ex7_practice08 {
	public static void main(String[] args) {
		Outer3 o = new Outer3();
		Outer3.Inner i = o.new Inner();
		
		i.method1();

	}

}
