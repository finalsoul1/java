package p415;

public class Test {

	public static void main(String[] args) {
		int result = divide(3, 0);
		// divide �޼Ҹ� ȣ���ߴµ� �޼ҵ� ó�� �߿� ���ܰ� �߻��߰� 
		// throw e; ��� �ڵ�� �߻��� ���������� ���� �ִ� ��ü�� �����ϸ� 
		// divide �޼ҵ带 ȣ���� �ڵ� �κп��� ���ܰ� �߻��� ������ ����Ѵ�
		// throw e; �ڵ尡 �ִ°Ͱ� ����
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
			
			throw e; // ���ܸ� �� �޼ҵ带 ȣ���� ������ �����Ѵ�
		}
		return result;
	}

}
/*
 * Object
 * 		Throwable : ���� ����
 * 			Exception : checked exception
 * 				Exception Ŭ������ �� �ڽ� ����Ŭ������ �߻��ϸ�
 * 				�����ڰ� �ݵ�� try~catch �ؾ� �Ѵ�.
 * 
 * 				RuntimeException : unchecked exception
 * 				try ~ catch�� ���û����̴�
 * 
 * 					ArithmeticException
 */


