package p377;

/*
 *  �߻�ȭ ������ �����ϴ� 3����
 *  [concrete] class : ��üŬ����, �Ϲ�Ŭ���� : �Ϲ� �޼ҵ常 ���� �� �� �ִ�
 *  abstract class : �Ϲݸ޼ҵ嵵 �ְ�, �߻�޼ҵ嵵 ���� �� �ִ�. �߻�޼ҵ� �տ� abstract Ű���带 ������ �� ����
 *  interface : �Ϲݸ޼ҵ尡 ���� �������̽�, abstract Ű���带 �����ص� ���� ������ �����Ѵ�
 */
public abstract class Lotto {

	public abstract void printNumber(int[] numbers);

	public abstract int[] getNumbers();

	public void printNumbersMulti(int[][] numbers) {
		for (int[] nums : numbers) {
			for (int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
