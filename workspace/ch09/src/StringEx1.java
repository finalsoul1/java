class StringEx1 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";

		System.out.println("String str1 = \"abc\";");
		System.out.println("String str2 = \"abc\";");

		System.out.println("str1 == str2 ?  " + (str1 == str2));
		// String Ŭ������ equals �޼ҵ�� �����ϴ� ���ڿ��� ���ϴ� ������ ������ �Ǿ� �ִ�
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		System.out.println();

		// ���ڿ��� �ٸ� ���� ���α׷����κ��� �޾� ���� ��쿡 �ش��Ѵ�
		String str3 = new String("\"abc\""); // from : ���� �����ӿ�ũ
		String str4 = new String("\"abc\""); // from : JDBC ���̺귯��

		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");

		System.out.println("str3 == str4 ? " + (str3 == str4));
		// ���ڿ� �񱳴� equals �޼ҵ带 ����Ѵ�
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
	}
}
