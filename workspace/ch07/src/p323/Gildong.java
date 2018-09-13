package p323;

public class Gildong extends Korean {

	/*
	 * Comment(주석)
	 */
	
	// Annotation(주해) (@)
	@Override // 해당 메소드는 부모클래스가 정의한 메소드인데 자식이 다시 정의해서 덮어쓴 상태다
	public void play() {
//		super.play();
		System.out.println("술을 마신다.");
		}
}
