class ExceptionEx12 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} // ���� Ŭ�������� static����̹Ƿ� ��ü�������� ���� ȣ�Ⱑ��.
	} // main�޼����� ��

	static void method1() throws Exception {
		method2();
	} // method1�� ��

	static void method2() throws Exception {
		throw new Exception("���ܰ� �߻��߾��!");
	} // method2�� ��
}
