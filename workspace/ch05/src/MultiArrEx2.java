import java.util.*;

class MultiArrEx2 {
	public static void main(String[] args) {

//		example();
//		
//		3x3 �迭�� ����ó�� �ʱⰪ�� �Ҵ��ϰ� ����ؼ� �����Ͻÿ�
//		#1
//		[1, 2, 3]
//		[4, 5, 6]		
//		[7, 8, 9]

		int[][] num = new int[3][3];
		int k = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				k++;
				num[i][j] = k;
			}
		}

		// ��º�
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d ", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();

//		#2
//		[1, 2, 3]
//		[6, 5, 4]
//		[7, 8, 9]

		k = 0;
		for (int i = 0; i < 3; i++) {
			if (i % 2 == 1) {
				for (int j = 2; j >= 0; j--) {
					k++;
					num[i][j] = k;
				}
			} else {
				for (int j = 0; j < 3; j++) {
					k++;
					num[i][j] = k;
				}
			}
		}
		// ��º�
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d ", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();

//		#3
//		[1, 2, 3]
//		[8, 9, 4]
//		[7, 6, 5]

		int i = 0, j = -1;
		int t = 1;
		int n = 0;
		int sw = 3;
		k = 1;
		while (0 < sw) {
			for (n = 0; n < sw; n++) {
				j = j + t;
				num[i][j] = k;
				k++;
			}
			sw--;
			for (n = 0; n < sw; n++) {
				i = i + t;
				num[i][j] = k;
				k++;
			}
			t = -t;
		}
		// ��º�
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d ", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	} // main�� ��

	private static void example() {
		final int SIZE = 5;
		int x = 0, y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		// �迭�� ��� ��Ҹ� 1���� SIZE*SIZE������ ���ڷ� �ʱ�ȭ
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}

		// �迭�� ����� ���� �ڼ��´�.(shuffle)
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				// bingo[i][j]�� ���Ƿ� ���õ� ��(bingo[x][y])�� �ٲ۴�.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���.(����:0)>", SIZE * SIZE);
			String tmp = scanner.nextLine(); // ȭ�鿡�� �Է¹��� ������ tmp�� ����
			num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

			// �Է¹��� ���ڿ� ���� ���ڰ� ����� ��Ҹ� ã�Ƽ� 0�� ����
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2�� �ݺ����� �����.
					}
				}
			}
		} while (num != 0);
	}

}
