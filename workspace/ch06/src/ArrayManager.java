import java.util.Arrays;

public class ArrayManager {

	private int[][] ary;

	public ArrayManager() {
	}

	public ArrayManager(int length) {
		ary = new int[length][length];
	}

	public int[][] getAry() {
		return ary;
	}

	public void setAry(int[][] ary) {
		this.ary = ary;
	}

	public int findMaxNumber() {

		int max = ary[0][0];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[0].length; j++) {
				if(max < ary[i][j])
					max = ary[i][j];
			}
		}
		return max;

	}

	public void print() {
		for (int i = 0; i < ary.length; i++) {
			System.out.println(Arrays.toString(ary[i]));
		}
	}
}