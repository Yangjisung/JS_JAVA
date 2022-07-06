class Outer {
	class Inner {
		int iv = 100;
	}
}
public class Ex7_practice06 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner ii = o.new Inner();
		System.out.println(ii.iv);
		

	}

}
