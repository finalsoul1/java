package P345;

public class Test {

	// 관습적으로 상수는 대문자로 변수명을 작성
	static 
//	final // 값의 재 할당을 금지한다 
	double PI = 3.14;
	
	public static void main(String[] args) {
		PI = 3.141592;
	}
}

// Printer 클래스 설계자가 이 클래스를 상속하여 기능을 확장하는 것을 원하지 않을 때가 있다
// final : 클래스 앞에 붙이면 이 클래스를 상속하는 클래스를 만들 수 없다
class Printer {
	// final: 메소드 앞에 붙이면 이 메소드를 오버라이딩할 수 없다
	public void print(String message) {
		System.out.println("");
	}
}

class BetterPrinter extends Printer {
	@Override
	public void print(String message) {
		super.print(message);
//		System.out.println(message);
	}
}