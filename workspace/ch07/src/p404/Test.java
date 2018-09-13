package p404;

// p404 폴더 밑에 있는 BigBox 클래스가 안쪽에 있는 TinyBox 클래스를 사용하겠다
import p404.BigBox.TinyBox; // 대문자 연속이라는 건 이너클래스라는 말임

public class Test {

	public static void main(String[] args) {
		BigBox bb = new BigBox();
		bb.printA();
//		bb.printB(); // 비추천
	
		/*
		 * No enclosing instance of type BigBox is accessible. 
		 * Must qualify the allocation with an enclosing instance of type BigBox 
		 * (e.g. x.new A() where x is an instance of BigBox).
		 */
		
		BigBox.printB(); // in a static way
		
		TinyBox tb = bb.new TinyBox();
		tb.show();
	}

}
