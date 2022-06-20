import java.util.Arrays;
public class Ex5_5 {

	public static void main(String[] args) {
		System.out.println("------------------------자주쓰이는 class--------------------------------");
		String str ="ABCDE"; // index : 0,1,2,3,4
		
		// 1. char charAt(index)
		char ch = str.charAt(3); // 문자열 str의 4번째 문자 'D'를 ch에 저장.
		System.out.println("첫번째 charAt:" + ch);
		
		// 2. substring(int from, int to)
		String tmp = str.substring(1,4); // str에서index 1~4의 문자들을 반환
		System.out.println("두번째 substring:" + tmp);
		
		System.out.println("------------------------Array--------------------------------");
		
		// Array
		// 1. toString( ), deepToString( )
		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12},{21,22}};
		System.out.println("toString:" + Arrays.toString(arr)); // 일차원
		System.out.println("deepString:" + Arrays.deepToString(arr2D)); // 다차원
		
		// 2. equals( ), deepEquals( )
		String [][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String [][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		System.out.println("equals:" + Arrays.deepEquals(str2D,str2D2)); // 다차원
		
		// 3. copyOf( ), copyOfRange( )
		int [] arr2 = Arrays.copyOf(arr, arr.length); // 복사할 배열, 복사할 갯수(?)
		int [] arr3 = Arrays.copyOfRange(arr, 2,4); //from ~ to
		System.out.println("copyOf:" + Arrays.toString(arr2));
		System.out.println("copyOfRange:" + Arrays.toString(arr3));
		
		
		// 4. sort( )
		int [] arr4 = {4,1,3,2,0};
		Arrays.sort(arr4);
		System.out.println("sort:" + Arrays.toString(arr4));
		
		
		
	} // main

}
