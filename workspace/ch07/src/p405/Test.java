package p405;

// p404 ���� �ؿ� �ִ� BigBox Ŭ������ ���ʿ� �ִ� TinyBox Ŭ������ ����ϰڴ�
import p405.BigBox.TinyBox; // �빮�� �����̶�� �� �̳�Ŭ������� ����

public class Test {

	public static void main(String[] args) {
		// inner class �տ� static Ű���带 ���̸� �ٱ��� Ŭ������ ��üȭ ���ο� ������� �̳�Ŭ������ ��ü�� ���� �� �ִ�
		TinyBox tb = new BigBox.TinyBox();
		tb.show();
	}

}
