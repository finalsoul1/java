class ExceptionEx01 {
	public static void main(String[] args) {

//		int x = 3 / 0;
//		int y = 2;
//		System.out.println(1 == 1 || 3 / 0 > 0);

		try {
			try {
			} catch (Exception e) {
			}
		} catch (Exception e) {
			try {
			} catch (Exception e) {
			} // ����. ���� e�� �ߺ� ����Ǿ���.
		} // try-catch�� ��

		try {

		} catch (Exception e) {

		} // try-catch�� ��
	} // main�޼����� ��
}
