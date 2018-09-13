package p377;

import java.util.Random;

public class RandomLotto extends Lotto {

	@Override
	public void printNumber(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}

	@Override
	public int[] getNumbers() {
		Random rnd = new Random();
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(45) + 1;
		}
		return nums;
	}

}
