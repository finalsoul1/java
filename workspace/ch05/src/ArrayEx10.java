import java.util.*;

class ArrayEx10 {
	public static void main(String[] args) {

//		example();

		int[] nums = { 1, 4, 7, 3, 2 };
		boolean sw = false;

		// �迭�� ���� �ִ� ������ �������� �����Ͽ� ����Ͻÿ�.
		// [1, 2, 3, 4, 7]

		for (int i = 0; i < nums.length - 1; i++) {
			sw = false;
			for (int j = 0; j < nums.length - 1 - i; j++) {
				if (nums[j] > nums[j + 1]) {
					int tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
					sw = true;
				}
			}
			if (!sw) {
				System.out.println("�Ϸ�");
				break;
			}
			System.out.println(Arrays.toString(nums));
		}
		System.out.println("���");
		System.out.println(Arrays.toString(nums));
	} // main�� ��

	private static void example() {

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.printf("\n-------------\n");

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // ���� ���� ������ ���� �ٲ۴�.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // �ڸ��ٲ��� �߻������� changed�� true��.
				}
			} // end for j

			if (!changed)
				break; // �ڸ��ٲ��� ������ �ݺ����� �����.

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]); // ���ĵ� ����� ����Ѵ�.
			System.out.println();
		} // end for i
		System.out.println(Arrays.toString(numArr));
	}
}
