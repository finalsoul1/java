
public class Review2 {

	public static void main(String[] args) {

		Bicycle b = new Bicycle();
		
		b.speedUp(10);
		
		b.printState();
		
	}

}

// ������ ���赵

class Bicycle {

	int speed = 0; // ������� : Ư�� ������ �ʱ�ȭ ���� ������ �̸� ������ �⺻������ �ڵ����� �ʱ�ȭ

	void speedUp(int increment) { // �Ķ���� ���� : �ܺο��� ���޹��� ��
		speed = speed + increment;
	}

	void printState() {

		int mySpeed = speed; // �������� : ���� ���� �Ҵ��� �Ŀ� ����ؾ� �Ѵ�
		System.out.printf("speed = %d", mySpeed);
	}

}