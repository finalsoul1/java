package P345;

public class Test {

	// ���������� ����� �빮�ڷ� �������� �ۼ�
	static 
//	final // ���� �� �Ҵ��� �����Ѵ� 
	double PI = 3.14;
	
	public static void main(String[] args) {
		PI = 3.141592;
	}
}

// Printer Ŭ���� �����ڰ� �� Ŭ������ ����Ͽ� ����� Ȯ���ϴ� ���� ������ ���� ���� �ִ�
// final : Ŭ���� �տ� ���̸� �� Ŭ������ ����ϴ� Ŭ������ ���� �� ����
class Printer {
	// final: �޼ҵ� �տ� ���̸� �� �޼ҵ带 �������̵��� �� ����
	public void print(String message) {
		System.out.println("");
	}
}

class BetterPrinter extends Printer {
	@Override
	public void print(String message) {
		super.print(message);
//		System.out.println(message);
	}
}