class ExceptionEx12 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} // 같은 클래스내의 static멤버이므로 객체생성없이 직접 호출가능.
	} // main메서드의 끝

	static void method1() throws Exception {
		method2();
	} // method1의 끝

	static void method2() throws Exception {
		throw new Exception("예외가 발생했어요!");
	} // method2의 끝
}
