
public class P291 {

	public static void main(String[] args) {
		Superman s = new Superman(); // new Ŭ���������� �� �ϳ�(������ �Ķ����)
		
		Superman s2 = new Superman("Clark"); 
		// ��ü�� �����ϴ� ������ ��ü�� ������� name�� �Ҵ��� ���� �����ϸ鼭 �� ��ü�� ����� ����̴�
		
		Spiderman sp = new Spiderman();
	}
}

class Spiderman {
	// �����ڸ� �ƹ��͵� ������� ������ �����Ϸ��� �ڵ����� ����Ʈ �����ڸ� �߰��� �ش�
//	public Spiderman() {
//	}
}

class Superman extends Object{ // ��� ��ü�� �θ����� �����϶�� ����� Object
	String name;
	
	// Ŭ���� ������� ctrl + space >> ����Ʈ���� >> ������
	// ������ : new �����ڷ� ��ü�� ������ �� ó���ؾ� �ϴ� �ڵ带 ���� ������ �޼ҵ��̴�
	// �޼ҵ�� ����÷ : �빮�ڷ� �����Ѵ�(Ŭ������� ����) 
	// �����ڸ� �տ� �����ڷ��� ǥ�Ⱑ ����
	public Superman() { // �⺻������ : �Ķ���͸� �����ʴ� ������ (����Ʈ ������)
		System.out.println("Superman() called.");
	}

	public Superman(String name) { // ������ �ñ׳�ó, ������ �����ε�
		super(); // �������� ����� : �뵵�� ������, super�� �θ� ��ü�� ��ġ�ϴ� Ű����, super() �θ� Ŭ������ ����Ʈ �����ڸ� ȣ���ϴ� ��
		this.name = name; // this�� ��ü �ڱ��ڽ��� ��ġ�ϴ� Ű����
		System.out.println("Superman(String name) called");
	}
	
}