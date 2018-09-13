package p330;

public class Test {

	public static void main(String[] args) {

		new Gildong();
		// ����� ���� ��Ű�� ���ؼ� �ڽİ�ü���� �θ�ü�� ���� ��������� �Ѵ�
//		Korean() called.
//		HongFamily() called.
//		Gildong() called.

		Gildong g1 = new Gildong();
		// �ڽİ�ü���� ���� ����� �ڿ��� ����Ѵ�
		System.out.println(g1.food);
		g1.play();

		// ��ĳ����(Up-casting) : ��ü �ڷ������� ��Ī���� �ʰ� �θ��ڷ������� ������ ��Ī�ϴ� ��
		// ������(Polymorphism) : ��Ӱ��迡 ���� ��ĳ����/�ٿ�ĳ������ �Ͽ� ��� ��ü�� ����� �� �ִ� ����

		HongFamily g2 = new Gildong();
		Gildong g4 = (Gildong) g2;
		Korean g5 = g4; // ����� �ڽİ�ü�� ������ ĳ���ý� ũ��� �θ�ü�� �� ū������ ģ�� (�ڵ� ĳ����)

		HongFamily gilsoon = new Gilsoon();

		int a = 10;
		long b = a; // �ڵ� ĳ����
		short c = (short) a; // ����� ĳ����

		System.out.println("----------");

		Korean g3 = new Gildong();
		System.out.println(g3.food); 
		// ���������� ������ ���еǰ� �޼ҵ�� �����ǵȴ�
		// ��Ī�� ���� ������ ��Ī�� ������ �ް� �޼ҵ�� ��ü�� ������ �޴´�
		g3.play(); // �޼ҵ�� ��Ī�� ������� ��ü���� ���� ����� �޼ҵ尡 ���ȴ�

		HongFamily hf = (HongFamily) g3;
		System.out.println(hf.food);
		hf.play(); // ��������� ��Ī�� ������ ����

	}
}
