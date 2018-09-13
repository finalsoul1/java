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
		System.out.println("3 : 생성자");

		nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i * i;
		}
	}

	public static void main(String args[]) {
//		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		// 클래스 코드 처리순서 : 1. main코드 2. 클래스가 메모리에 로딩될때 클래스변수
		// 3. new 했을때 인스턴스변수 4. 생성자
		System.out.println();

//		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest(); // static은 이미 가동중이므로 다시 안함

		System.out.println(Arrays.toString(bt2.nums));
	}
}
