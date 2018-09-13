import java.util.*;

class FlowEx178Basic {
	public static void main(String[] args) {

		int num = 0;

		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
		proceed();
		proceed();
		proceed();
		
		for (int i = 1; i <= 3; i++) {
			proceed();
		}
		
	}

	private static void proceed() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}