import java.util.Arrays;

class ArrayEx01 {
	public static void main(String[] args) {

		// �迭 array
		// ���� �ڷ����� ������ �������� �ϳ��� ��� �ٷ�� ��ü

		String[] names = new String[3]; // �迭 ���� �� �ݵ�� �����ϴ� �������� ������ ���� ���ڸ� ����ؾ��Ѵ�
		names[0] = "Spring";
		names[1] = "Summer";
		names[2] = "Autumn";
//		names[3] = "X"; �迭 ����� [3]�� ���̸� �ǹ� [3]������ �ƴ�

//		String[] names = {"Spring", "Summer", "Autumn"};  // ���� ����, ���� ���� ���ص� �ʱⰪ�� ������ ���� ��ũ�Ⱑ ������ ������
		System.out.println(Arrays.toString(names));
		
		int tmp1 = (int) (Math.random() * 100) +1;
		System.out.println(tmp1);
		
		int[] score = new int[5];
		int k = 1;

		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70; // score[2] = 70
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // int tmp = score[3] + score[4]

		// for������ �迭�� ��� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]); // index�� ������ ��� ��
	} // main
}
