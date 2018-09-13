import java.util.Arrays;

class BlockTest {

	static String a = "";

	static {
		System.out.println("1 : static { }");
	}

	String b = "";

	{
		System.out.println("2 : { }");
	}

	int[] nums;

//	{
//		nums = new int[10];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = i * i;
//		}
//	}

	public BlockTest() {
		System.out.println("3 : ������");

		nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * i;
		}
	}

	public static void main(String args[]) {
//		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		// Ŭ���� �ڵ� ó������ : 1. main�ڵ� 2. Ŭ������ �޸𸮿� �ε��ɶ� Ŭ��������
		// 3. new ������ �ν��Ͻ����� 4. ������
		System.out.println();

//		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest(); // static�� �̹� �������̹Ƿ� �ٽ� ����

		System.out.println(Arrays.toString(bt2.nums));
	}
}
