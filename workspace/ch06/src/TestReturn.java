
public class TestReturn {

	public static void main(String[] args) {

		int a = 10;
		short b = (short) a;
		long c = a;

		System.out.println(TestReturn.add(2, 3));
		System.out.println(add(2, 3)); // �̿��ϴ� ������ �����ϴ� ������ �ϳ��� Ŭ���� ���� �����Ҷ� Ŭ������ ��������
		
		
		print("Hello World!");
		print(" ");
	}

	private static void print(String string) { // �׳� ȭ�鿡 ����ϸ� �Ǳ� ������ ���ϰ� ���ʿ�
		if(string.equals(" ")) { // �� ���ڿ��� �� ȭ�� ����۾��� ���� �ʴ´�
			return;  // �޼ҵ� ���� ó���� ������
		}
		
		System.out.println("--------------");
		System.out.println(string);
		System.out.println("--------------");		
	}

	static long add(int i, int j) {

//		int result = i + j;
//		return result; 

		return i + j;
	}
}
