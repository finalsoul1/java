
public class P278 {
	// #1 : 변수에 static을 붙이면 static 메소드에서 사용할 수 있게 된다
	// 프로그램 시작 시 (main메소드 보다 앞서서) 자동으로 메모리 처리가 되고 프로그램이 끝날때까지 유지된다 (전역변수, 공유변수)
	// 대표적인 전역변수 대상은 상수가 있다
	// final : 최초 할당만 가능하고 재할당은 불가능하게 만드는 키워드
	static final double PI = 3.141592;
	
	static String name = "홍길동";

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		say();
	}

	private static void say() {
		
		// Cannot make a static reference to the non-static field name
		// 비 정적 필드 이름에 대한 정적 참조를 만들 수 없습니다.
		// static 메소드 내에서 non-static 변수를 사용할 수 없다.
		
		// 메소드는 static 키워드를 붙여서 메모리에 존재하며 기동할 수 있는데, 그 메소드에서 사용하고자 하는
		// 변수 name은 static 키워드가 없어서 메모리에 존재하지 않고 따라서 사용할 수 없는 상태이다
		
		System.out.println("안녕하세요 " + name + "님!");
	}
}
