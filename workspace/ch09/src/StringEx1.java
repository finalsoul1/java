class StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2));
		// String 클래스의 equals 메소드는 보관하는 문자열을 비교하는 것으로 재정의 되어 있다
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		// 문자열을 다른 연동 프로그램으로부터 받아 쓰는 경우에 해당한다
		String str3 = new String("\"abc\""); // from : 서블릿 프레임워크
		String str4 = new String("\"abc\""); // from : JDBC 라이브러리

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		// 문자열 비교는 equals 메소드를 사용한다
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}
