package p381;

// interface
// 인터페이스는 추상메소드의 집합문서다
// 인터페이스 안에는 static 변수, 메소드, default 메소드, abstract 메소드 만을 가질 수 있다
// 바디연산자가 있는 일반 메소드를 가질 수 없다
public interface Lotto {

	// abstract : 추상 클래스/메소드를 선언하는 키워드
	// 추상메소드는 범위연산자({코드(바디)})를 갖고 있지 않다
	// 추상메소드란? 로직이 없는 메소드다. 메소드명, 받는 파라미터 정보, 리턴 자료형 정보만을 제공하는 역할을 수행
	// 인터페이스 안에 추상메소드는 abstract 키워드가 생략이 가능하다. 인터페이스는 일반메소드를 가질 수 없기 때문
	public abstract void printNumber(int[] numbers);
	
	public int[] getNumbers();
}
