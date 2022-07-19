public class Practice_5 {
	static boolean stopped = false;
	public static void main(String[] args) {
		Thread5 th1 = new Thread5();
		th1.start();
		System.out.println("시작: " +th1.isInterrupted());
		try {
			Thread.sleep(6 * 1000);
		} catch (Exception e) {}
		stopped = true; // 쓰레드 정지
//		th1.interrupt(); // th1 쓰레드의 일시정지 상태를 깨움.
		System.out.println("iterrupt 호출 후 상태: " +th1.isInterrupted());
		System.out.println("stopped");
		System.out.println("stopped 후 : " +th1.isInterrupted());
	}
}
class Thread5 extends Thread {
	public void run() {
		for(int i = 0; !Practice_5.stopped; i++) { // ture가 아닌 동안 = false인 동안, 정지상태가 아닌동안 반복, ture 나오면 반복문 벗어남
			System.out.println(i);
			System.out.println("반복문 진행 중: " +this.isInterrupted());
			try {
				Thread.sleep(3 * 1000);
				System.out.println("try: " +this.isInterrupted());
			} catch(Exception e) {}

		}
	} //run
}
