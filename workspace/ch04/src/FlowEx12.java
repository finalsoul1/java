class FlowEx12 {

	int count = 20; // ������� : Ŭ������ new �� �� ��������� ��ü�� �⺻ ����� �ȴ�, �� �Ҵ� ���ϸ� �⺻�� �ڵ��Ҵ�

	void print(int count) { // �Ķ���� ���� : �޼ҵ尡 ȣ��� �� �ܺο��� ���� �� ���� �Ҵ�Ǹ鼭 ����� ����

	}

	public static void main(String[] args) {

		int count = 10; // �������� : �ڵ� ó���� �帧�� ������ �� �ڵ����� �޸𸮿� ������ ���������. ���� ���� �Ҵ��ؾ���

		if(true) {
			// ���������ڸ� �������� ���ʿ��� �ٱ��ʿ� �ִ� ������ �����ؼ� ����� �� �ִ�
			int count2 = count;
			
			int count3 = 20;
		}
		// ���������ڸ� �������� ���ʿ��� ������ ������ �ٱ��ʿ��� �����ؼ� ����� �� �ִ�
		// int count4 = count3;  < �ȵȴ�
		
		

		for (int i = 1; i <= 5; i++)
			System.out.println(i); // i�� ���� ����Ѵ�.

		for (int i = 1; i <= 5; i++)
			System.out.print(i); // println()��� print()�� ���� ���η� ��µȴ�.

		System.out.println();
	}
}
