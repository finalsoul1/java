package p482;

public class Test {

	public static void main(String[] args) {
		/*
		 * String ������ ���ڿ��� �����ϸ� ��ü�� �����ǹǷ� ���� �ʽ��ϴ� ���ڿ��� ������ �� ��� StringBuffer,
		 * StringBuilder�� ����մϴ�
		 * 
		 * StringBuffer : ��Ƽ������ ȯ�濡�� ����Ѵ�. ��Ƽ�����忡���� �����ϰ� ����Ǳ� ���ؼ� �ڵ��� �κ����� ���� �ɷ��ֱ� ������
		 * ó���ӵ��� StringBuilder���� ������
		 * 
		 * StringBuilder : �̱۽����� ȯ�濡�� ����Ѵ�
		 */

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			stringBuilder.append(i);
		}
		System.out.println(stringBuilder.toString());
	}

}
