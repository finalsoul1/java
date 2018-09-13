
public class Ex4_4 {

	public static void main(String[] args) {

		int i, j;
		int sum = 0;
		for (i = 1; i < 500; i++) {
			if (i % 2 == 0) {
				j = -i;
			} else {
				j = i;
			}
			sum = sum + j;
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("i = " + i + ", sum = " + sum);
	}
}
