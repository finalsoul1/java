
// A ������ �ۼ�
class Parent {
	void parentMethod() {
		System.out.println("Parent");
	}
}

// B ������ �ۼ�
class Child extends Parent {
	// �ֳ����̼�(����)
	// �ҽ��ڵ� �ȿ� �ٸ� ���α׷��� ���� ������ ���Խ�Ű�� ���
	@Override
	void parentMethod() {
		System.out.println("Child");
	}
}

public class AnnotationEx1 {
	public static void main(String[] args) {
		Parent c = new Child();
		c.parentMethod(); // �޼ҵ�� �ڱⲲ ���´�
	}
}