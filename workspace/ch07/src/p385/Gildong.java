package p385;

// ����� ���ϻ�Ӹ� �����ϴ�
// ������ ���߱����� ����
public class Gildong extends Korean implements Flyable, Swimmable {

	@Override
	public void fly() {
		System.out.println("���� Ÿ�� ���� �ٴѴ�.");
	}

	@Override
	public void swim() {
		System.out.println("������ �ų��� �Ѵ�.");
	}

	public void doSomethingAfterMeal() {
		System.out.println("��ġ���� �Ѵ�.");
	}
	
}
