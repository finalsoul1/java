
public class ArrayMain {

	public static void main(String[] args) {
		ArrayManager am = new ArrayManager(4);

		am.print();
//		출력결과
//		[0, 0, 0, 0]
//		[0, 0, 0, 0]
//		[0, 0, 0, 0]
//		[0, 0, 0, 0]

		int[][] ary = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		am.setAry(ary);
		am.print();
//		[3, 2, 1]
//		[6, 5, 4]
//		[9, 8, 7]

		int maxNumber = am.findMaxNumber();
		System.out.println("Max number is " + maxNumber);
//		Max number is 9
	}

}
