package P368;

public class Tv3 extends Product {
	public Tv3() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);			// Tv�� ������ 100�������� �Ѵ�.
		// �θ�Ŭ������ �⺻ �����ڰ� ���� �Է°��� �޴� �����ڸ� �����Ƿ� �Է°��� �����
	}

	@Override
	public String toString() {	// ObjectŬ������ toString()�� �������̵��Ѵ�.
		return "Tv";
	}
}
