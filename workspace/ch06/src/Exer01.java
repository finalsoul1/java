import java.util.Scanner;

public class Exer01 {

	int a;

	public static void main(String[] args) {

		int a = 0;

//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("입력하세요 : ");
//		
//		String tmp = scan.nextLine();
//		
//		System.out.println(tmp);

		a = (int) (Math.random() * 45) + 1;

		System.out.println(a);

		final int NUM = 10;

		int[] arr = new int[NUM];
		int[][] num = new int[NUM][NUM];
		int sum = 0;

		for (int i = 0; i < NUM; i++) {
			for (int j = 0; j < NUM; j++) {
				num[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
		System.out.println();

		for (int[] tmp : num) {
			for (int i : tmp)
				System.out.printf("%4d", i);
			System.out.println();
		}
		System.out.println();

		for (int[] tmp : num) {
			for (int i : tmp)
				System.out.print("\t" + i);
			System.out.println();
		}
		
		for (int tmp : arr) {
			System.out.println(tmp);
		}

	}

}
