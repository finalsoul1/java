package P368;

public class Test {

	public static void main(String[] args) {
		Superman s = new Superman();

		System.out.println(s); // print 메소드는 객체 참조값을 갖고 있는 변수를 받으면 s.toString() 리턴값을 사용한다
		System.out.println(s.toString());
		// 슈퍼클래스 Object가 정의한 메소드 toString()은 "클래스설계도@해쉬코드" 문자열을 리턴하도록 행동한다
		// 자식클래스가 toString() 메소드를 재정의해서 객체의 상태정보를 문자열로 돌려주는 방식을 조작할 수 있다

		String msg = s + "is a hero!";

		System.out.println(msg);
	}
}

class Superman {
	String name = "Clark";

	// 권고 : 슈퍼클래스가 제공하는 메소드 중에서 필요하다면 재정의해서 사용하는 메소드가 4가지 있다
	@Override
	public String toString() {
		return "{ name : " + name + " } ";
	}

}