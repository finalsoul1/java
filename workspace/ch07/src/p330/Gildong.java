package p330;

public class Gildong extends HongFamily {

	public Gildong() {
		// super : 부모객체
		// super() : 부모생성자, 생략이 가능하다, 생략하면 부모의 디폴트생성자를 호출하는 코드가 자동으로 추가된다
		super();
		System.out.println("Gildong() called.");
	}
}
