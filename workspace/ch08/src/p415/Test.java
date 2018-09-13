package p415;

public class Test {

	public static void main(String[] args) {
		int result = divide(3, 0);
		// divide 메소를 호출했는데 메소드 처리 중에 예외가 발생했고 
		// throw e; 라는 코드로 발생된 예외정보를 갖고 있는 객체를 전달하면 
		// divide 메소드를 호출한 코드 부분에서 예외가 발생된 것으로 취급한다
		// throw e; 코드가 있는것과 같다
		// try ~ ca
		System.out.println("result = " + result);
		
		
	}

	private static int divide(int i, int j) {
		int result = 0;
		try {
			result = i / j;
		} catch (RuntimeException e) {
//			e.printStackTrace();
//			java.lang.ArithmeticException: / by zero
//			/ by zero
//			result = 0
//				at p415.Test.divide(Test.java:15)
//				at p415.Test.main(Test.java:6)
//			System.out.println(e.getMessage());
			
			throw e; // 예외를 이 메소드를 호출한 측으로 전달한다
		}
		return result;
	}

}
/*
 * Object
 * 		Throwable : 예외 전파
 * 			Exception : checked exception
 * 				Exception 클래스와 그 자식 예외클래스가 발생하면
 * 				개발자가 반드시 try~catch 해야 한다.
 * 
 * 				RuntimeException : unchecked exception
 * 				try ~ catch는 선택사항이다
 * 
 * 					ArithmeticException
 */


