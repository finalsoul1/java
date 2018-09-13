
public class Review {

	public static void main(String[] args) {
		
		// 클래스 설계도를 사용하여 객체를 만드는 문법
		// new 클래스명();
		new Dog();
		

		// 힙메모리에 만들어진 객체를 실제로 사용하려면 그 객체를 가리키는 변수를 통해서 접근해야 한다
		// 자료형 : 그 객체의 설계도
		Dog myDog = new Dog();
		
		String breed = "멍멍이"; // String 도 객체다
		
		myDog.run(breed);
	}

}
// 관찰대상 실체를 보고 설계도 Class를 만든다
// Class : 객체를 만들기 위한 설계도
// Object : 여러개의 변수와 메소드를 갖고 있으며 변수와 메소드를 위한 메모리를 차지하고 있는 상태

class Dog {
	// 자료형 : 해당 변수가 취급하는 데이터의 종류 및 크기

	byte age = 2;

	// 자료형의 종류
	// 크기가 한정되어 있는 자료형 : 원시타입 자료형 (기본형)

	// 크기가 무한한 자료형 : 참조타입 자료형(객체)
	// 문자열 ==> String
	// 배열 ==> [ ]
	// 객체 ==> new 클래스명()

	// 메소드를 만드는 문법
	// 리턴자료형 메소드명 (파라미터) {.....}

	// 파라미터 : 메소드가 호출되어 기동할 때 외부로부터 받는 값
	// void : 해당 메소드는 return 하는 값이 없다
	void run(String breed) {
		System.out.println(breed + "개가 달린다");

	}
}