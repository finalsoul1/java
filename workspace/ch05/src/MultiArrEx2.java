import java.util.*;

class MultiArrEx2 {
	public static void main(String[] args) {

//		example();
//		
//		3x3 배열에 다음처럼 초기값을 할당하고 출력해서 증명하시오
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

		// 출력부
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
		// 출력부
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
		// 출력부
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d ", num[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	} // main의 끝

	private static void example() {
		final int SIZE = 5;
		int x = 0, y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner scanner = new Scanner(System.in);

		// 배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				bingo[i][j] = i * SIZE + j + 1;
			}
		}

		// 배열에 저장된 값을 뒤섞는다.(shuffle)
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
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

			System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)>", SIZE * SIZE);
			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문을 벗어난다.
					}
				}
			}
		} while (num != 0);
	}

}
