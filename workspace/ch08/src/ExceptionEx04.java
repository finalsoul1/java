class ExceptionEx04 {
	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(4);

//			throw new ArithmeticException();
			throw new RuntimeException();
		} catch (IndexOutOfBoundsException e) {
			// try�κп��� �߻��� ���� instanceof Exception�� true�� ��
			// Exception e = try�κп��� �߻��� ���� �Ҵ��ϰ� catch ��Ͼȿ� �ڵ带 �����Ѵ�

			System.out.println(5_1);
		} catch (ArithmeticException e) {
			System.out.println(5_2);
		} catch (Exception e) {
			// ����Ŭ���� ���Ʈ������ �θ� Ŭ������ �ϴܿ� ��ġ�ؾ� �Ѵ�
			System.out.println(5_3);
		} // try-catch�� ��
		System.out.println(6);
	} // main�޼����� ��
}
