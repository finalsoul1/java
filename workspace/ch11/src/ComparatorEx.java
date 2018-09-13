import java.util.Arrays;
import java.util.Comparator;

class ComparatorEx {
	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr); // String�� Comparable������ ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���о���
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	/*
	 * ���ϰ�
	 * 1 : ũ��
	 * 0 : ����
	 * -1 : �۴�
	 */
	public int compare(Object o1, Object o2) {
		// o1, o2�� ����Ű�� ��ü�� Comparable �������̽� ����ü�ν�
		// ��ü�ȿ� compareTo �޼ҵ尡 �����Ѵ�
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; 
			// -1�� ���ؼ� �⺻ ���Ĺ���� ������ �����Ѵ�.
			// �Ǵ� c2.compareTo(c1)�� ���� ������ �ٲ㵵 �ȴ�.

		}
		return -1;
	}
}
