import java.util.Arrays;

// 자바 컴파일러에게는 줄 바꿈이 의미가 없다 
class ArrayEx18 {
	public static void main(String[] args) {

		int eng = 85;
		int[] nums = { 80, 90, 70 };
		int[][] scores = {{ 80, 90, 70 }, {60,80,100}};

		System.out.println(Arrays.toString(nums));
		nums = scores[0];
		System.out.println(Arrays.toString(nums));
		
		System.out.println(scores[0][0]);

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;
		
		System.out.println(score.length); // 4 행
		System.out.println(score[0].length); // 3 열

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}

		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}

		System.out.println("sum=" + sum);
	}
}
