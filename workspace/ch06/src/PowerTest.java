class PowerTest {
	public static void main(String[] args) {
		// ���ȣ�� : ���� �Ի� �����
		System.out.println(power(2, 1)); // 2 ^ 1 = 2
		System.out.println(power(2, 2)); // 2 ^ 2 = 4
		System.out.println(power(2, 3)); // 2 ^ 3 = 8

//		int x = 2; 
//		int n = 5; 
//		long result = 0; 
//
//		for(int i=1; i<=n; i++) { 
//			result += power(x, i); 
//		} 
//
//		System.out.println(result); 
		
	}

	static long power(int x, int n) {
		if (n == 1) {
			return x;
		}
		
		return x * power(x, n - 1);
		/*
		 *  power(2, 3) ���� ����
		 *  2 * power(2, 2) >> 2 * 2 * 2
		 *  2 * power(2, 1) >> 2 * 2
		 *  return 2;
		 */
		
	}
}
