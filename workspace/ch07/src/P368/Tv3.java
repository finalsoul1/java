package P368;

public class Tv3 extends Product {
	public Tv3() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);			// Tv의 가격을 100만원으로 한다.
		// 부모클래스에 기본 생성자가 없고 입력값을 받는 생성자만 있으므로 입력값을 줘야함
	}

	@Override
	public String toString() {	// Object클래스의 toString()을 오버라이딩한다.
		return "Tv";
	}
}
