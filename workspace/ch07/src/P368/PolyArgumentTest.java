package P368;

public class PolyArgumentTest {
	public static void main(String args[]) {
//		new Product(); // The constructor Product() is undefined ==> �⺻ �����ڰ� ���� ������ �Է°��� �����
		
		Buyer b = new Buyer();
		
		b.buy(new Tv3());
		b.buy(new Computer());

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}
}
