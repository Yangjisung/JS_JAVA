import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Ex15_5{
	public static void main(String[] args) throws IOException{
		try {
		FileInputStream fis = new FileInputStream(".\\src\\Ex15_5.java");
		FileOutputStream fos = new FileOutputStream(".\\src\\Ex15_5_1.java");
		// 이클립스에선 윗 줄 대신 아래 줄 입력하고 Run 으로 실행
		
		int data = 0;
		while((data=fis.read()) !=-1) 
			fos.write(data);
			
			
			fis.close();
		    fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main
}