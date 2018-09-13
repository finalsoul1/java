class ArrayEx06 {
	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	} // end of main

	private static void example2() {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			else if (score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}

	private static void example() {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // �迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		int min = score[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�.

		for (int i = 1; i < score.length; i++) { // �迭�� �ι�° ��Һ��� ���ϱ� ���� 1�� �ʱ�ȭ
			if (score[i] > max) {
				// max�� ���� ������ score[i]�� ���� ���� ũ�� �� ū ���� max�� �Ҵ�
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end of for

		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}
} // end of class
