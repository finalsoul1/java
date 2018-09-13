
public class Ex3_9 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = true;

		System.out.println('A' + 'B');
		System.out.println(b);

		ch = 'B';

		char lowerCase = (ch > 64 && ch < 97) ? (char) (ch + 32) : ch;

		System.out.println("ch: " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);

		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 || i % 3 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		sum = 0;
		int j = 0;
		for (int i = 1; i <= 10; i++) {
			j = j + i;
			sum = sum + j;
		}

		System.out.println(sum);

		sum = 0;
		j = 0;
		int i;
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

		sum = 0;
		for (i = 1; sum >= 100; i++) {
			if (i % 2 == 0) {
				j = -i;
			} else {
				j = i;
			}
			sum = sum + j;
		}
		System.out.println("i = " + i + ", sum = " + sum);

		i = 0;
		j = 0;
		while (i <= 10) {
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j = 0;
		}

		System.out.printf("\n======\n");

		for (i = 0; i <= 10; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		int count = 0;
		for (i = 1; i <= 6; i++) {
			for (j = 1; j <= 6; j++) {
				sum = i + j;
				if (sum == 6) {
					count++;
				}
			}
		}
		System.out.println(count);

		int value = (int) (Math.random() * 6) + 1;

		System.out.println(value);
		

	}
}
