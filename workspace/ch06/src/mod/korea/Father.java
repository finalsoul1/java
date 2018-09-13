package mod.korea;

public class Father {
	// 접근제어자 4가지
	private String privateValue = "X"; // 클래스 자기자신만 접근이 가능하다
	String defaultValue = "△"; // 접근제어자 default 상태, 클래스 자기자신 + 같은 패키지 소속 클래스
	protected String protectedValue = "□"; // 클래스 자기자신 + 같은 패키지 소속 클래스 + 상속관계 클래스
	public String publicValue = "○"; // 어떠한 클래스도 모두다 접근이 가능하다
	
	public void show() {
		System.out.println(privateValue);
		System.out.println(defaultValue);
		System.out.println(protectedValue);
		System.out.println(publicValue);
	}
}


