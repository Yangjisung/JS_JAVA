
public class Practic_1 {

	public static void main(String[] args) {
		Runnable th1 = new Thread1();
		Thread t2 = new Thread(th1);
	}// main

}
class Thread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}