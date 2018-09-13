class ExceptionEx09 {
	public static void main(String args[]) {
		try {
			divide(3, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void divide(int i, int j) throws Exception {
		try {
			int result = i / j;
			System.out.println("result = " + result);
		} catch (Exception e) {
//			System.out.println("예외가 발생했어요.");
			
			// 메소드 개발자가 직접 예외를 처리하지 않고
			// 메소드를 이용하는 측에서 예외처리를 하게 하고 싶다
//			RuntimeException ex = new RuntimeException("고의로 발생시켰음.");
			// 언체크드 계열의 예외인 RuntimeException을 사용하면
			// 이용하는 측 개발자가 try~catch 적용여부를 강제당하지 않는다
			// 그래서 RuntimeException 클래스와 그 자식 클래스들은 언체크드계열의 예외라고 부른다
			
			Exception ex = new RuntimeException("고의로 발생시켰음.");
			// 체크드 계열의 예외인 Exception을 사용하면
			// 이용하는 측 개발자가 try~catch를 반드시 적용해야 한다
			throw ex; // 예외를 발생시킴
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}
