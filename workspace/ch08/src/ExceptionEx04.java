class ExceptionEx04 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(4);

//			throw new ArithmeticException();
			throw new RuntimeException();
		} catch (IndexOutOfBoundsException e) {
			// try부분에서 발생한 예외 instanceof Exception이 true일 때
			// Exception e = try부분에서 발생한 예외 할당하고 catch 블록안에 코드를 수행한다

			System.out.println(5_1);
		} catch (ArithmeticException e) {
			System.out.println(5_2);
		} catch (Exception e) {
			// 예외클래스 상속트리에서 부모 클래스를 하단에 배치해야 한다
			System.out.println(5_3);
		} // try-catch의 끝
		System.out.println(6);
	} // main메서드의 끝
}
