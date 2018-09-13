class ExceptionEx01 {
	public static void main(String[] args) {

//		int x = 3 / 0;
//		int y = 2;
//		System.out.println(1 == 1 || 3 / 0 > 0);

		try {
			try {
			} catch (Exception e) {
			}
		} catch (Exception e) {
			try {
			} catch (Exception e) {
			} // 에러. 변수 e가 중복 선언되었다.
		} // try-catch의 끝

		try {

		} catch (Exception e) {

		} // try-catch의 끝
	} // main메서드의 끝
}
