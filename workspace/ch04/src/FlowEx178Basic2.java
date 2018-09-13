import java.util.*;

class FlowEx178Basic2 {
	public static void main(String[] args) {

		int num = 5;

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		int mid = num / 2;

		for (int i = 0; i < num; i++) {
			if (i < mid) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < (num - i); j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i % 2 == 0) {
					System.out.print(" * ");
					break;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		System.out.println("-------");

		int mid1 = (num / 2);
		int n = 1;

		for (int i = 0; i < num; i++) {
			if (i <= mid1) {
				for (int j = mid1 - i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			} else {
				n = n - mid1 * 2;
				for (int j = 0; j < i - mid1; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}
			n = n + 2;
			System.out.println();
		}
	}
}