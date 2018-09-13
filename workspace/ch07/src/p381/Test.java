package p381;

// Test use Lotto. Test 클래스가 Lotto 인터페이스 구현객체를 사용한다
// Test depend on Lotto. 다른말로 표현하면 Test 클래스는 Lotto 인터페이스 구현객체에 의존한다고 할 수 있다
// Test 클래스가 멤버변수로 갖고 있도록 하는 것이 일반적이다
public class Test {
	// 인터페이스 구현객체를 업캐스팅해서 인터페이스 자료형으로 지칭할 수 있다
	// 이는 변수 lotto가 가리키는 객체는 Lotto 인터페이스가 제안하는 추상메소드를 갖고 있는 객체임을 나타낸다
	Lotto lotto = new LottoImpl();
	Lotto rndLotto = new RandomLotto();

	// 인터페이스는 로직이 없는 추상메소드가 있으므로 new 연산자로 객체를 만들 수 없다
//	Lotto lo = new Lotto();

	public static void main(String[] args) {
		// 인터페이스를 구현한 객체를 사용하면
		// 사용자의 입장에서 해당 객체를 사용하는 방법이 일정하므로 굉장히 편리하다
		LottoImpl lotto = new LottoImpl();
		lotto.printNumber(lotto.getNumbers());
		
		RandomLotto rndLotto = new RandomLotto();
		rndLotto.printNumber(rndLotto.getNumbers());
		
		Test test = new Test();
		test.rndLotto.printNumber(test.lotto.getNumbers());
	}
}
