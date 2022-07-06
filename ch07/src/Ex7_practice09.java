import java.awt.*; // 윈도우 프로그래밍
import java.awt.event.*;

public class Ex7_practice09 {
	public static void main(String[] args) {
		
		Frame f = new Frame();
//		f.addWindowListener(new EventHandelr())
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
			}
		});
	}//main
} 

//class EventHandelr extends WindowAdapter {
//	public void windowClosing(WindowEvent e) {
//	e.getWindow().setVisible(false);
//	e.getWindow().dispose();
//	System.exit(0);
//	}
//	
//}