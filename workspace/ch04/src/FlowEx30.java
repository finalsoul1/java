class FlowEx30 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while (true) {
			if (sum > 100)
				break; // ���� ����� �ݺ����� Ż��
			++i; // i = i + 1
			sum += i;
		} // end of while

		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

		// 1, 2, 3, ..... 100������ �����߿� Ȧ���� ���� ����Ͻÿ�

		sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("for Ȧ���� �� : " + sum);

		i = 1;
		sum = 0;
		while(i<=100) {
			if (i % 2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("while Ȧ���� �� : " + sum);
		
		// 1, 2, 3, .... 100������ �����߿� 3�� ����� ������ ����� ����Ͻÿ�
		
		int count = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) { // 3���� ������ �������� 0, 1, 2�� ���´�
				count++;
			}
		}
		System.out.println("for 3�ǹ���� ���� : " + count);
		
		i = 1;
		count = 0;
		while(i<=100) {
			if (i % 3 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("while 3�ǹ���� ���� : " + count);
	}
}
