package p381;

import java.util.Arrays;

// A implements B
// A concrete Ŭ������ B interface�� �����ϴ� abstract �޼ҵ带 �����ϰڴٰ� ����Ѵ�
public class LottoImpl implements Lotto {

	@Override
	public void printNumber(int[] numbers) {
		System.out.println(Arrays.toString(numbers));
	}

	@Override
	public int[] getNumbers() {
		int [] nums = {1, 4, 5, 7, 23, 34};
		return nums;
	}

}
