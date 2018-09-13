class StringBufferEx1 {
	public static void main(String[] args) {
		veryBad();

		thisIsGood();
		/*
		 * 문자열을 반복적으로 조작해야 하는 경우 StringBuffer 객체를 사용하면 메모리를 아낄 수 있다
		 */

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		// StringBuffer 클래스의 equals 메소드는 비교연산자와 똑같이 작동한다
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

		// StringBuffer가 보관하는 문자열을 String으로 변환한다.
		String s = sb.toString(); // String s = new String(sb);와 같다.
		String s2 = sb2.toString();

		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

	private static void thisIsGood() {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}

	private static void veryBad() {
		/*
		 * 문자열을 보관하는 객체의 생성여부는 개발자가 결정하지 않는다 
		 * String 객체는 immutable (값이 한번 할당되면 변경할 수 없다) 이다
		 */

		String txt = ""; // new
		for (int i = 0; i < 100; i++) {
			txt = txt + i; // 문자열+정수 = 문자열+문자열 // new * 100번
			/*
			 * txt =   txt + i; 
			 * "0"      "" + 0 
			 * "01"    "0" + 1 
			 * "012"  "01" + 2
			 */
		}
		System.out.println(txt);
	}
}
