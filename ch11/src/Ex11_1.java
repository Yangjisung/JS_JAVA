import java.util.*;

public class Ex11_1 {
     public static void main(String[] args) {
    	 ArrayList list1 = new ArrayList(10);
    	 // 기본 길이 (용량, capacity)가 10인 ArrayList를 생성 , 각 배열안에 객체 가 아닌 객체주소값이 저장됨
    	 // ArrayList에는 객체만 저장 가능
    	 // autoboxing 에 의해 기본형이 참조형으로 자동변환 
    	 list1.add(new Integer(5)); //  = list.add(5); 기본형을 넣을 수 없으나 오토박싱으로 인해 기본형> 참조형으로 자동변환됨.
    	 list1.add(new Integer(4));
    	 list1.add(new Integer(2));
    	 list1.add(new Integer(0));
    	 list1.add(new Integer(1));
    	 list1.add(new Integer(3)); 
    	 
    	 ArrayList list2 = new ArrayList(list1.subList(1,4)); // from ~ to, 1부터 4까지 (1=< x < 4) index 1,2,3 = 4,2,0 추출
    	 //subList 는 원래 읽기 전용임. 
    	 print(list1, list2);
    	 
    	 //Collection은 인터페이스 , Collections 유틸 클래스
    	 Collections.sort(list1); // sort = 정렬
    	 Collections.sort(list2);
    	 print(list1, list2);
    	 
    	 System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // list1 이 list2 요소를 다 포함하고 있는지 - > t
    	 
    	 list2.add("B"); // 그냥 뒤에 추가
    	 list2.add("C"); // 그냥 뒤에 추가
    	 list2.add(3,"A"); //index 3번째에 "A"를 추가
    	 print(list1, list2);
    	 
    	 list2.set(3, "aa"); // set 은 변경
    	 print(list1, list2);
    	 
    	 list1.add("1"); //문자열 1 추가
    	 System.out.println("index = " + list1.indexOf("1")); // indexOf() 매개변수의 인덱스 위치를 출력
    	 print(list1, list2);
 } // main
     
     static void print(ArrayList list1, ArrayList list2) {
    	 System.out.println("list1 :" + list1);
    	 System.out.println("list2 :" + list2);
    	 System.out.println();
     }
}// Ex_11_1
