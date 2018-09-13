import java.util.*;

class FlowEx25 {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;

//		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
//		num = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		num = getValueFromUser(); // ĸ��ȭ : ������ �κ��� ���μ� ����ڴ� �ܼ��ϰ� ����� �� �ֵ��� ����� ���

		while (num != 0) {
			// num�� 10���� ���� �������� sum�� ����
			sum += num % 10; // sum = sum + num%10;  
			// 10���� ������ ������ �ڸ����� �� ���ϱ�
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10; // num = num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
			// 10���� ������ ������ ������ �ڸ����� �� �����ϱ�
		}

		System.out.println("�� �ڸ����� ��:" + sum);
	}

	private static int getValueFromUser() {

		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		return Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

	}
}
