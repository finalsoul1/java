
public class TestReturn {

	public static void main(String[] args) {

		int a = 10;
		short b = (short) a;
		long c = a;

		System.out.println(TestReturn.add(2, 3));
		System.out.println(add(2, 3)); // 이용하는 로직이 제공하는 로직과 하나의 클래스 내에 존재할때 클래스명 생략가능
		
		
		print("Hello World!");
		print(" ");
	}

	private static void print(String string) { // 그냥 화면에 출력하면 되기 때문에 리턴값 불필요
		if(string.equals(" ")) { // 빈 문자열일 때 화면 출력작업을 하지 않는다
			return;  // 메소드 로직 처리를 끝낸다
		}
		
		System.out.println("--------------");
		System.out.println(string);
		System.out.println("--------------");		
	}

	static long add(int i, int j) {

//		int result = i + j;
//		return result; 

		return i + j;
	}
}
