class FactorialTest {
	public static void main(String args[]) {
		
		// 문제 : 1 * 2 * 3 * 4 의 결과를 구하시오
		// 4! = 4 * 3 * 2 * 1
		
		int result = factorial(4);  // int result = FactorialTest.factorial(4);

		System.out.println(result);
	}
	
	/*
	 *  factorial(4) >> 24
	 *  4 * factorial(4-1) >> 4 * 6 >> return 24
	 *  3 * factorial(3-1) >> 3 * 2 >> return 6
	 *  2 * factorial(2-1) >> 2 * 1 >> return 2
	 *  1 
	 *  return 1
	 *  위로 다시 돌아감
	 */.

	static int factorial(int n) {
		int result=0;

		if ( n == 1) {
			result = 1;		
		} else {
			result = n * factorial(n-1);		// 다시 메서드 자신을 호출한다.
		}

		return result;
	}
}
