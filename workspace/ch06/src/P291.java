
public class P291 {

	public static void main(String[] args) {
		Superman s = new Superman(); // new 클래스생성자 중 하나(전달할 파라미터)
		
		Superman s2 = new Superman("Clark"); 
		// 객체를 생성하는 시점에 객체의 멤버변수 name에 할당할 값을 전달하면서 새 객체를 만드는 방법이다
		
		Spiderman sp = new Spiderman();
	}
}

class Spiderman {
	// 생성자를 아무것도 명시하지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가해 준다
//	public Spiderman() {
//	}
}

class Superman extends Object{ // 모든 객체의 부모역할을 수행하라고 만든게 Object
	String name;
	
	// 클래스 빈공간에 ctrl + space >> 컨스트럭터 >> 생성자
	// 생성자 : new 연산자로 객체를 생성할 때 처리해야 하는 코드를 위한 일종의 메소드이다
	// 메소드와 차이첨 : 대문자로 시작한다(클래스명과 동일) 
	// 생성자명 앞에 리턴자료형 표기가 없다
	public Superman() { // 기본생성자 : 파라미터를 받지않는 생성자 (디폴트 생성자)
		System.out.println("Superman() called.");
	}

	public Superman(String name) { // 생성자 시그너처, 생성자 오버로딩
		super(); // 빨간색은 예약어 : 용도가 정해짐, super는 부모 객체를 장치하는 키워드, super() 부모 클래스의 디폴트 생성자를 호출하는 것
		this.name = name; // this는 객체 자기자신을 장치하는 키워드
		System.out.println("Superman(String name) called");
	}
	
}