
public class Ex3_9_산술변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 0;
		
		j = i++; // 후위 형
		System.out.println("j=1++; 실행 후, i=" + i + ", j="+ j);
		
		i = 5;
		j = 0;
		
		j = ++i; // 전위형
		System.out.println("j=++i; 실행 후, i=" + i +", j=" + j);
	}

}
