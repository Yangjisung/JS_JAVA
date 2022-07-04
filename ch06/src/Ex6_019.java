class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
		// isPowerOn의 값이true 면 false, false면  ture 로 바꾼다.
	}
	void volumeUp() {
		if(volume < MAX_VOLUME)
			volume++;
		//volume의 값이 max 보다 작을 때만 값을 1증가 시킨다.
	}
	void volumeDown() {
		if(volume > MIN_VOLUME) //
			volume--;
		//volume 값이 min 보다 클때만 값을 1감소시킨다.
	}
	void channelUp() {
		if(channel == MAX_CHANNEL) {  // 100 == 100
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		//채널 값의 1증가시킨다.
		//만일 채널 이 max면, 채널 값을  min_channel로 바꾼다.
	}
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
		//채널 값의 1감소킨다.
		//만일 채널 이 min면, 채널 값을  min_channel로 바꾼다.
	}
	
}// class MyTv
public class Ex6_019 {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	} // main
} // ex6_019



