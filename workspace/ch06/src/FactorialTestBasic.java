class FactorialTestBasic {
	public static void main(String args[]) throws InterruptedException {

		p();

	}

	// ���ѷ����� ������ ������ �ᱹ �޸𸮺������� ���ܰ� �߻��Ͽ� �ߴܵȴ�. �̷� ������ �ݱ��
	private static void p() throws InterruptedException {
		System.out.println("Hello");

		Thread.sleep(2000);
		
		p();
		
	}
}
