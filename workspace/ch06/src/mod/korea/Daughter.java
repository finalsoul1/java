package mod.korea;

// A extends B : A 클래스는 B 클래스의 자식입니다. B 클래스는 A 클래스의 부모입니다
// A 클래스는 B 클래스의 자식으로 자식 클래스는 부모인 B 클래스의 자원 (변수, 메소드)에 접근하여 사용할 수 있다 
// 부모 클래스가 갖고 있는 자원의 접근범위를 자식 클래스까지 연장하겠다
public class Daughter extends Father {
	public void show() {
//		System.out.println(privateValue);
		System.out.println(defaultValue);
		System.out.println(protectedValue);
		System.out.println(publicValue);
	}
}
