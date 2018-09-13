import java.util.Arrays;
import java.util.Random; // rnd ���� ����

class ArrayEx08 {

	static Random rnd = new Random();

	public static void main(String[] args) {
//		example();

		// 1 ~ 45 ������ ������ ���� 6���� ����Ͻÿ�. ��, �ߺ����ڴ� ī��Ʈ���� �ʴ´�.

		int[] ball = new int[6];

		for (int i = 0; i < ball.length; i++) {
//			int n = (int) (Math.random() * 45) + 1;
			ball[i] = rnd.nextInt(45) + 1;
			
			// TODO : �̹� ���� ���ڶ�� ������ �� ���ڸ� ���ؼ� �ֵ��� �Ѵ�
			for (int j = 0; j < i; j++) {
				if (ball[j] == ball[i]) {
					i--;
				}
			}
		}

		// sort �޼ҵ�� �迭������ ���� ���޸𸮿� �ִ� �迭��ü�� ������� �����۾��� �����ϰ� �ش� ��ü�� ����� �����
		Arrays.sort(ball); // �⺻�� �������� �����̴�

		System.out.println(Arrays.toString(ball));

	}

	private static void example() {
		// 45���� �������� �����ϱ� ���� �迭 ����.
		int[] ball = new int[45];

		// �迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for (int i = 0; i < ball.length; i++)
			ball[i] = i + 1; // ball[0]�� 1�� ����ȴ�.

		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44������ ������ ���� ��´�.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}

		// �迭 ball�� �տ��� ���� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}
}
