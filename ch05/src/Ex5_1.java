import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 배열의 생성/작성방법
//		int[] score; // 1.배열 score를 선언 (참조변수)
//		score = new int[5]; // 2.배열의 생성 (int 저장공간 x 5)
		
//		int[] score = new int[5];
//		score[3] = 100;
//		System.out.println("score[0]="+score[0]);
//		System.out.println("score[1]="+score[1]);
//		System.out.println("score[2]="+score[2]);
//		System.out.println("score[3]="+score[3]);
//		System.out.println("score[4]="+score[4]);
//		
//		int value = score[3];
//		System.out.println(value);
		// 2. 배열의 길이
//		int[] arr = new int[10]; //
//		System.out.println("arr.length=" + arr.length);
//		
//		for(int i=0; i<10; i++) {
//			System.out.println("arr["+i+"]="+arr[i]);
//		}
		
		// 3.배열의 출력
		int [] iArr = {100, 90, 80, 70, 60}; // iArr.length = 5
//		for(int i=0; i<iArr.length; i++) {
//			System.out.println(iArr[i]);
//		} //for 문
		
		System.out.println(Arrays.toString(iArr));
	}

}
