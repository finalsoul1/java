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
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
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
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}

	private static void example() {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

		for (int i = 1; i < score.length; i++) { // 배열의 두번째 요소부터 비교하기 위해 1로 초기화
			if (score[i] > max) {
				// max가 가진 값보다 score[i]가 가진 값이 크면 그 큰 값을 max에 할당
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end of for

		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
} // end of class
