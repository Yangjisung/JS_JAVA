import java.io.*;
import java.util.Arrays;

class Ex15_2 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};  // 0~9 , 10
		byte[] outSrc = null; // null
		byte[] temp = new byte[10]; //배열크기가 10

		ByteArrayInputStream  input  = null; // 초기화
		ByteArrayOutputStream output = null; // 초기화

		input  = new ByteArrayInputStream(inSrc); //입력 스트림생성
		output = new ByteArrayOutputStream(); // 출력스트림 생성

		input.read(temp,0,temp.length); // 읽어 온 데이터를 배열 temp에 담는다.
		//입력 스트림으로부터 temp.length 만큼 읽어옴, temp배열의 0위치에저장하고 읽은 바이트 수를 input에 반환
		// 10읽어오고, 
		// temp[] == {0,1,2,3,4,5,6,7,8,9} 가 저장됨.
		output.write(temp,5, 5);        // temp[5]부터 5개의 데이터를 write한다.
		//temp 배열에서, [5]째 == 5 부터, 5개 데이터를 wirte
		outSrc = output.toByteArray();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}