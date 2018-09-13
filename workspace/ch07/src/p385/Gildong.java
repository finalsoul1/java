package p385;

// 상속은 단일상속만 가능하다
// 구현은 다중구현이 가능
public class Gildong extends Korean implements Flyable, Swimmable {

	@Override
	public void fly() {
		System.out.println("담을 타고 날아 다닌다.");
	}

	@Override
	public void swim() {
		System.out.println("수영을 신나게 한다.");
	}

	public void doSomethingAfterMeal() {
		System.out.println("양치질을 한다.");
	}
	
}
