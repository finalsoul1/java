package mod.korea;

/*
 *  Father 클래스의 부하직원 Employee 클래스
 */
public class Employee {
	public void show() {
		// Employee 클래스와 Father 클래스는 상속관계가 아니므로
		// Employee 클래스에서 Father 클래스의 자원을 사용하려면 Father 클래스로 만든 객체를 획득해야 한다
		
		Father father = new Father();
		
//		System.out.println(father.privateValue);
		System.out.println(father.defaultValue); 
		System.out.println(father.protectedValue);
		System.out.println(father.publicValue);
	}
}
