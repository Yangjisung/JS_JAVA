public class Ex7_practice01_02 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) //cards 객채배열의 크기(20)만큼
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
//		for (int i = 0; i < CARD_NUM; i++) {
//			if(i==0 || i==2 || i==7) { // 숫자가 1, 3, 8인 경우 광으로 출력
//				cards[i] = new SutdaCard(i+1, true);
//			} else {
//				cards[i] = new SutdaCard((i%10)+1, false);
//			}
//		}
//	} // SutdaDeck 생성자 (1번)
		
		for(int i=0; i < cards.length; i++) {
			int num = i%10+1; // 0~19까지, %(나머지 연산자)10 + 1
			boolean isKwang = (i < 10) && (num==1 || num==3 || num==8); // && 비교연산자
			cards[i] = new SutdaCard(num, isKwang);
			}
		}// SutdaDeck 생성자 (2번)
	
	void shuffle () {
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			//SutdaCard[i]와 cards[j] 의 값을 서로 바꾼다.
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}// shuffle
	
	SutdaCard pick(int index) {
		if(index < 0 || index >= CARD_NUM) // index 유효성 검사(오류방지; 지정범위 이탈방지)
			return null;
		return cards[index];
	}
	SutdaCard pick() {
		int index = (int)(Math.random()*cards.length);
		return pick(index); //
	}
} //SutdaDeck class

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "k" : ""); // 다중삼항식 을 사용하여 isKwang이 t일경우 k, f일경우 빈문자열 출력
	}
}// SutdaCard
