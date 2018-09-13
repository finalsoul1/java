package p330;

public class HongFamily extends Korean{
	String food = "치즈"
			+ "";

	public HongFamily() {
		System.out.println("HongFamily() called.");
	}

	// 메소드 재정의
	public void play() {
		System.out.println("술을 마신다.");
	}
	
	public void doSomethingAfterMeal() {
			System.out.println("트림을 한다.");
		}
}
