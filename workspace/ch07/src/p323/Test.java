package p323;

public class Test {
	// �ڹٴ� ������ ���ϻ�Ӹ� �����մϴ�
	// 1. ��? - ���������ϱ�
	// 2. ����? - ����
	
	public static void main(String[] args) {
		Gildong g = new Gildong();
		
		g.play();
		
		Korean k = new Korean();
		k.play();
		
		// Object Ŭ������ �ڽĿ��� �����ϴ� toString() �޼ҵ�� �⺻������ ��ü�� ���� �� ����� Ŭ���� ������ 
		// ���ڿ��� �����Ѵ�
		System.out.println(k.toString());
	}
}
