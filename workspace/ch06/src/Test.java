import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] ary = makeArray(10); // 정수 10개를 담고 있는 배열을 리턴하는 메소드

		System.out.println(Arrays.toString(ary));
		// 출력결과
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		int operand = 10;
		ary = evenItemsMultiply(ary, operand);

		System.out.println(Arrays.toString(ary));
//		출력결과
//		[1, 20, 3, 40, 5, 60, 7, 80, 9, 100]

	}

	private static int[] makeArray(int i) {
		int[] num = new int[i];

		for (int n = 0; n < i; n++) {
			num[n] = n + 1;
		}
		return num;
	}

	private static int[] evenItemsMultiply(int[] ary, int operand) {

		int[] num1 = ary;

		for (int n = 0; n < operand; n++) {
			if (n % 2 != 0) {
				num1[n] = (n + 1) * 10;
			}
		}
		return num1;
	}
}
