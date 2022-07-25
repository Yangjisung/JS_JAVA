import java.io.FileInputStream;
import java.io.IOException;

class Ex15_4{
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream(".\\src\\Ex15_4.java");
//		FileInputStream fis = new FileInputStream(args[0]);
		// 이클립스에선 윗 줄 대신 아래 줄 입력하고 Run 으로 실행
		
		int data = 0;
		
		while((data=fis.read()) !=-1) {
			char c = (char)data;
			System.out.print(c);
		}
	}// main
}