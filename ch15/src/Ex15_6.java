import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Ex15_6{
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
			
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}// for
			fos.close(); // 123.text에 1~5까지만 출력됨, 
//			bos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// main
}