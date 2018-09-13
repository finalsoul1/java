package P368;

public class PolyArgumentTest {
	public static void main(String args[]) {
//		new Product(); // The constructor Product() is undefined ==> 기본 생성자가 없기 때문에 입력값을 줘야함
		
		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
