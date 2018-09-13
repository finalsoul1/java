
public class P278 {
	// #1 : ������ static�� ���̸� static �޼ҵ忡�� ����� �� �ְ� �ȴ�
	// ���α׷� ���� �� (main�޼ҵ� ���� �ռ���) �ڵ����� �޸� ó���� �ǰ� ���α׷��� ���������� �����ȴ� (��������, ��������)
	// ��ǥ���� �������� ����� ����� �ִ�
	// final : ���� �Ҵ縸 �����ϰ� ���Ҵ��� �Ұ����ϰ� ����� Ű����
	static final double PI = 3.141592;
	
	static String name = "ȫ�浿";

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		say();
	}

	private static void say() {
		
		// Cannot make a static reference to the non-static field name
		// �� ���� �ʵ� �̸��� ���� ���� ������ ���� �� �����ϴ�.
		// static �޼ҵ� ������ non-static ������ ����� �� ����.
		
		// �޼ҵ�� static Ű���带 �ٿ��� �޸𸮿� �����ϸ� �⵿�� �� �ִµ�, �� �޼ҵ忡�� ����ϰ��� �ϴ�
		// ���� name�� static Ű���尡 ��� �޸𸮿� �������� �ʰ� ���� ����� �� ���� �����̴�
		
		System.out.println("�ȳ��ϼ��� " + name + "��!");
	}
}
