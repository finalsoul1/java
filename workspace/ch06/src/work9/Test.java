package work9;

//main �޼ҵ��� �������� ������ ����.
//
//50 == 2550 - 2500
//true
//
//�̿ϼ��� oddSum(), evenSum(), proceed() 3���� �޼ҵ带 �ϼ��Ͻÿ�.
public class Test {

	public static void main(String[] args) {
		int oddResult = oddSum(1, 100);
		int evenResult = evenSum(1, 100);
		int result = proceed(100);

		System.out.printf("%d == %d - %d\n", result, oddResult, evenResult);
		System.out.println(result == (oddResult - evenResult) ? true : false);
	}

	/**
	 * 2 + 4 + 6 + ... + 100 �� ���� ���Ѵ�.
	 */
	private static int evenSum(int begin, int max) {

		int sum = 0;

		for (int i = begin; i <= max; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 1 + 3 + 5 + ... + 99 �� ���� ���Ѵ�.
	 */
	private static int oddSum(int begin, int max) {

		int sum = 0;

		for (int i = begin; i < max; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * 1 - 2 + 3 - 4 + ... + 99 - 100 �� ���� ���Ѵ�.
	 */
	private static int proceed(int max) {

		int sum = 0;

		for (int i = 1; i <= max; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
			else {
				sum = sum - i;
			}
		}
		return sum;
	}
}