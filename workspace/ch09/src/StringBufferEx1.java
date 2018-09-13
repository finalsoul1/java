class StringBufferEx1 {
	public static void main(String[] args) {
		veryBad();

		thisIsGood();
		/*
		 * ���ڿ��� �ݺ������� �����ؾ� �ϴ� ��� StringBuffer ��ü�� ����ϸ� �޸𸮸� �Ƴ� �� �ִ�
		 */

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		// StringBuffer Ŭ������ equals �޼ҵ�� �񱳿����ڿ� �Ȱ��� �۵��Ѵ�
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

		// StringBuffer�� �����ϴ� ���ڿ��� String���� ��ȯ�Ѵ�.
		String s = sb.toString(); // String s = new String(sb);�� ����.
		String s2 = sb2.toString();

		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

	private static void thisIsGood() {
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < 100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}

	private static void veryBad() {
		/*
		 * ���ڿ��� �����ϴ� ��ü�� �������δ� �����ڰ� �������� �ʴ´� 
		 * String ��ü�� immutable (���� �ѹ� �Ҵ�Ǹ� ������ �� ����) �̴�
		 */

		String txt = ""; // new
		for (int i = 0; i < 100; i++) {
			txt = txt + i; // ���ڿ�+���� = ���ڿ�+���ڿ� // new * 100��
			/*
			 * txt =   txt + i; 
			 * "0"      "" + 0 
			 * "01"    "0" + 1 
			 * "012"  "01" + 2
			 */
		}
		System.out.println(txt);
	}
}
