package P368;

public class Test {

	public static void main(String[] args) {
		Superman s = new Superman();

		System.out.println(s); // print �޼ҵ�� ��ü �������� ���� �ִ� ������ ������ s.toString() ���ϰ��� ����Ѵ�
		System.out.println(s.toString());
		// ����Ŭ���� Object�� ������ �޼ҵ� toString()�� "Ŭ�������赵@�ؽ��ڵ�" ���ڿ��� �����ϵ��� �ൿ�Ѵ�
		// �ڽ�Ŭ������ toString() �޼ҵ带 �������ؼ� ��ü�� ���������� ���ڿ��� �����ִ� ����� ������ �� �ִ�

		String msg = s + "is a hero!";

		System.out.println(msg);
	}
}

class Superman {
	String name = "Clark";

	// �ǰ� : ����Ŭ������ �����ϴ� �޼ҵ� �߿��� �ʿ��ϴٸ� �������ؼ� ����ϴ� �޼ҵ尡 4���� �ִ�
	@Override
	public String toString() {
		return "{ name : " + name + " } ";
	}

}