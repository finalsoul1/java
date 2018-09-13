package work3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int length = 5;
		int startNumber = 10;

		int[] ary = createArray(length, startNumber);

		System.out.println(Arrays.toString(ary));
	}

	private static int[] createArray(int length, int startNumber) {

		int num[] = new int[length];
		int indexn = startNumber;

		for (int i = 0; i < length; i++) {
			num[i] = startNumber + i;
		}

		return num;
	}

//	출력결과
//	[10, 11, 12, 13, 14]

}