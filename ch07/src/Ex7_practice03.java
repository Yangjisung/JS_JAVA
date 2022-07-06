class Product
{
	int price; // 제품 가격
	int bonusPoint; // 제품구매시 제공하는 보너스포인트
	
	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}
class Tv extends Product {
	Tv() {
//     super();
	}
	public String toString() {
		return "Tv";
	}
}
public class Ex7_practice03 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
