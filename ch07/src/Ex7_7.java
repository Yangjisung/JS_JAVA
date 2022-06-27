
public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null; // 예시2번 = new Car();
		FireEngine fe = new FireEngine(); // 예시2번 =(FireEngine)c;
		FireEngine fe2 = null;
		
		fe.water(); //예시2번
		car = fe; // car = (car)fe; 형변환 생략 <조상 -> 자손>
		//car = water();
		
		fe2 = (FireEngine)car; //<자손 -> 조상>
		fe2.water();
	}//main

}//class

class Car { 
	String color;
	int door; 
	
	void drive() { 
	 System.out.println("drive, Brrr~~"); 
   }   
	void stop() { 
	 System.out.println("stopp!!"); 
   } 
} 
// class car 멤버 갯수:4개

 class FireEngine extends Car { 
    void water () { 
	 System.out.println("water!!"); 
	} 
}// class FireEngin 멤버 갯수: 5개

