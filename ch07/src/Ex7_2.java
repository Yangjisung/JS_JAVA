
public class Ex7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}//main

}//class

class parent{int x =10;}
class Child extends parent {
	int x = 20; // this.x
	
	void method () {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}