
public class Ex4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("sum=" + sum);
	}

}
