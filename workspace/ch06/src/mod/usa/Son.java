package mod.usa;

// Son 클래스와 Father 클래스는 다른 패키지에 있기 때문에 import로 경로를 설정해줘야 한다
import mod.korea.Father;

public class Son extends Father {
	public void show() {
//		System.out.println(privateValue);
//		System.out.println(defaultValue); // Son 클래스와 Father 클래스의 패키지가 다르다
		System.out.println(protectedValue);
		System.out.println(publicValue);
	}
}
