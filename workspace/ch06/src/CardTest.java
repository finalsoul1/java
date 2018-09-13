class CardTest{
	public static void main(String args[]) {
		// static 변수는 프로그램 시작 전 자동으로 메모리에 로드된다
		// 메모리에 해당 변수가 올라가 있기 때문에 new Car() 명령으로 객체를 만들지 않고도 해당 변수를 사용할 수 있다
		System.out.println("Card.width = "  + Card.width);
		System.out.println("Card.height = " + Card.height);

		// 인스턴스 변수는 해당 변수를 갖고 있는 클래스를 new 연산자로 인스턴스에서 객체를 만들 때 같이 메모리에 할당된다
		// 인스턴스 변수는 메모리에 자동으로 올라가지 않으므로 static 변수처럼 바로 사용할 수는 없다
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );		

		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
 }

class Card {
	String kind ;				// 카드의 무늬 - 인스턴스 변수
	int number;				    // 카드의 숫자 - 인스턴스 변수
	// 모든 카드가 크기가 같다. 따라서 객체마다 카드의 넓이 높이 정보를 각각 갖고 있을 필요가 없다
	static int width = 100;		// 카드의 폭  - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}
