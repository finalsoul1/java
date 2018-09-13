package p323;

public class Test {
	// 자바는 언제나 단일상속만 지원합니다
	// 1. 왜? - 복잡해지니까
	// 2. 정말? - 정말
	
	public static void main(String[] args) {
		Gildong g = new Gildong();
		
		g.play();
		
		Korean k = new Korean();
		k.play();
		
		// Object 클래스가 자식에게 제공하는 toString() 메소드는 기본적으로 객체를 만들 때 사용한 클래스 정보를 
		// 문자열로 리턴한다
		System.out.println(k.toString());
	}
}
