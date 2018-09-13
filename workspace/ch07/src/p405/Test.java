package p405;

// p404 폴더 밑에 있는 BigBox 클래스가 안쪽에 있는 TinyBox 클래스를 사용하겠다
import p405.BigBox.TinyBox; // 대문자 연속이라는 건 이너클래스라는 말임

public class Test {

	public static void main(String[] args) {
		// inner class 앞에 static 키워드를 붙이면 바깥쪽 클래스의 객체화 여부와 상관없이 이너클래스를 객체로 만들 수 있다
		TinyBox tb = new BigBox.TinyBox();
		tb.show();
	}

}
