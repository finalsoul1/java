import java.util.Arrays;

class ArrayEx05 {
	public static void main(String[] args) {

//		example();

		int[] score = { 100, 88, 100, 100, 90 };

		int sum = 0;
		float average;

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		average = (float) sum / score.length;

		System.out.println("�迭 : " + Arrays.toString(score));
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}

	private static void example() {
		
		int sum = 0; // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}

		average = sum / (float) score.length; // ������� float�� ��� ����.

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}

}
