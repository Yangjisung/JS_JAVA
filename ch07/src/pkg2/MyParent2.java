package pkg2;

import pkg1.MyParent; //ctrl + shift + o

class MyChild extends MyParent {}
public void printMembers() {
	System.out.println(prv); // 에러
	System.out.println(dft); // 에러
	System.out.println(prt);
	System.out.println(pub);
}
public class MyParent2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p = new MyParent();
		//System.out.println(p.prv); // 에러
		//System.out.println(p.dft); // 에러
		//System.out.println(p.prt); // 에러
		System.out.println(p.pub);

	}

}
