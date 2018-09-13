package p381;

import java.util.Arrays;

// A implements B
// A concrete 클래스가 B interface가 제안하는 abstract 메소드를 구현하겠다고 약속한다
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
