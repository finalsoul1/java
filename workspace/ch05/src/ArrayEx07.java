import java.util.Arrays;

class ArrayEx07 {
	public static void main(String[] args) {
		int[] numArr = new int[10];

		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i;  // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);  
		}
		System.out.println();
		System.out.println(Arrays.toString(numArr));

		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 10);	// 0~9���� �� ���� ���Ƿ� ��´�. (0~9�� +1 ����)

			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}

		for (int i=0; i < numArr.length ; i++ )
			System.out.print(numArr[i]);
		System.out.println();
		System.out.println(Arrays.toString(numArr));

	} // main�� ��
}
