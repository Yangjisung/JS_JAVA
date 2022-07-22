import java.io.*;
import java.util.Arrays;

class Ex15_1 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;

		ByteArrayInputStream input = null; //  초기화
		ByteArrayOutputStream output = null; // 초기화

		input = new ByteArrayInputStream(inSrc); // input 입력스트림 생성 후, inSrc를 읽어드림
		output = new ByteArrayOutputStream(); // 출력스트림 생성

		int data = 0; // data 초기화

		while((data = input.read())!=-1) // read():읽을 바이트(배열)가 없으면 -1이 출력된다.
			// input이 참조하고 있는 inSrc배열 요소를 모두 읽고나면 while반복문을 빠져나옴.
			
			output.write(data);	// void write(int b)
		  // output스트림에는 data 가 저장되어있음.
		
		outSrc = output.toByteArray(); // 스트림의 내용을 byte배열로 반환한다.

		System.out.println("Input Source  :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}