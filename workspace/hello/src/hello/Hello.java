package hello;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		if (args != null) {
			for (String txt : args) {
				System.out.print(txt + " ");
			}
		}
		/*
		 * class == new ==> Object
		 * 클래스(설계도) = 변수 + 메소드
		 * 
		 * 상속 : class A extends B
		 * 
		 * 메소드 오버로딩 : 메소드명은 같고 파라미터가 다르면 메소드 호출을 구분해서 연동하는 기술
		 * 
		 * 메소드 오버라이딩 : 부모가 정의한 메소드를 재정의
		 * 
		 * 생성자 : new 클래스() 
		 * 
		 * 접근제어자
		 * private : 클래스 안에서만 사용
		 * (default) : 같은 패키지 안에서만 사용
		 * protected : 다른 패키지 상속관계까지 사용
		 * public : 누구나 사용 가능
		 * 
		 * 다형성 : 객체의 실체는 변함이 없으나 필요에 따라서 객체를 지칭하는 방법을 변경하여 객체가 가진 변수의
		 * 은닉과 메소드의 재사용을  이용하는 기술
		 * 
		 * 추상메소드 : 바디({})가 없는 메소드

		 * 
		 * 인터페이스 : interface 클래스명
		 *  - 추상메소드
		 *  - static 변수, 메소드 // java 8
		 *  - default 메소드 // java 8 
		 *  
		 * 추상클래스 : abstract class 클래스명
		 *  - 일반클래스 능력 + 추상메소드
		 *  
		 * ---------------------------------------------
		 * 클래스 : class 클래스명
		 * 
		 * 자바책
		 * 여러권 보자
		 */
	}

}
