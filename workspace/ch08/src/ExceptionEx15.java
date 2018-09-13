import java.io.*;

class ExceptionEx15 {
	public static void main(String[] args) {

		args = new String[] { null };

		// command line���� �Է¹��� ���� �̸����� ���� ������ �����Ѵ�.
		File f = createFile(args[0]);
		System.out.println(f.getName() + " ������ ���������� �����Ǿ����ϴ�.");
	} // main�޼����� ��

	@SuppressWarnings("finally")
	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.equals(""))
				throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		} catch (Exception e) {
			// fileName�� �������� ���, ���� �̸��� '�������.txt'�� �Ѵ�.
			fileName = "�������.txt";
			
			// catch ��� �� �ڵ� : �ش� ���ܰ� �߻��� ���� �۵��Ѵ�
		} finally {
			// finally ��� �� �ڵ� : try ��� �� �ڵ� ������ ��, catch ��� �� �ڵ� �⵿���ο� �������
			// ������ ���������� �۵��ϴ� �ڵ带 ��ġ�ϴ� �����̴�
			File f = new File(fileName); // FileŬ������ ��ü�� �����.
			createNewFile(f); // ������ ��ü�� �̿��ؼ� ������ �����Ѵ�.
			return f;
		}
	} // createFile�޼����� ��

	static void createNewFile(File f) {
		try {
			f.createNewFile(); // ������Ʈ ���� �ؿ� ������ �����Ѵ�.
		} catch (Exception e) {
		}
	} // createNewFile�޼����� ��
}
