import java.util.Arrays;

class ArrayEx01 {
	public static void main(String[] args) {

		// 배열 array
		// 같은 자료형의 데이터 여러개를 하나로 묶어서 다루는 객체

		String[] names = new String[3]; // 배열 선언 시 반드시 보관하는 데이터의 개수를 위한 숫자를 명시해야한다
		names[0] = "Spring";
		names[1] = "Summer";
		names[2] = "Autumn";
//		names[3] = "X"; 배열 선언시 [3]은 길이를 의미 [3]까지가 아님

//		String[] names = {"Spring", "Summer", "Autumn"};  // 위와 같음, 따로 선언 안해도 초기값의 개수에 따라 방크기가 저절로 결정됨
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

		// for문으로 배열의 모든 요소를 출력한다.
		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}

		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]); // index의 범위를 벗어난 값
	} // main
}
