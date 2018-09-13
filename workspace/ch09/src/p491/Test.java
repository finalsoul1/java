package p491;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 30 };

		// java.lang.ArrayIndexOutOfBoundsException
//		nums[nums.length] = 40;

		// �����ӵ��� �ֿ켱�̶�� �迭�� ��������� �׷��� ���� ���
		// ����� ���� ������ ��ȣ�ϰ� �ȴ�. ������� Collection Ŭ�������� ��� ����Ѵ�

		// �����迭
		// <����ϴ� �ڷ���> : ���׸�
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10); // �ڵ����� new Integer(10)�� ó�� �� (����ڽ�)
		numbers.add(20);
		numbers.add(30);
		numbers.add(numbers.size() - 1, 40);
//		numbers.add(new Integer(100));

		// �⺻ �ڷ��� 8���� ��üŸ������ ����� �� �ֵ��� �� �ڷ������� �����ϴ� Ŭ������ �ִ�
		// �̵鰣�� ����ȯ�� ���� ���ڵ��̴�
		int a = 10;
		Integer aa = a; // ����Ÿ�� == ����ڽ� ==> ��üŸ��
		a = aa; // ��üŸ�� == �����ڽ�(Auto Unboxing) ==> ����Ÿ��

		Integer bb = new Integer(100);
		int b = bb;
		
		double x = add(2, 3);
	}

	private static double add(int i, Number j) {
		return i + j.doubleValue();
	}
	
}
