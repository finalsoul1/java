class FlowEx23Basic {
	public static void main(String[] args) {
		int i = 5;

		while (i-- != 0) { // ��ó�� ������ : �񱳺��� �ϰ� �� ������ -1 �� �����Ѵ�
			System.out.println(i + " - I can do it.");
		}

		System.out.println();

		i = 5;

		while (--i != 0) // ��ó�� ������ : ���� - 1 �� �����ϰ� �� ���� ���Ѵ�
			System.out.println(i + "- I can do it.");

		System.out.println();

		i = 5;

		while (i != 0) { // ��ó�� ������ : �񱳺��� �ϰ� �� ������ -1 �� �����Ѵ�
			i = i - 1;
			System.out.println(i + " - I can do it.");
		}

	} // main�� ��
}
