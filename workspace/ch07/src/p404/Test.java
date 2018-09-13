package p404;

// p404 ���� �ؿ� �ִ� BigBox Ŭ������ ���ʿ� �ִ� TinyBox Ŭ������ ����ϰڴ�
import p404.BigBox.TinyBox; // �빮�� �����̶�� �� �̳�Ŭ������� ����

public class Test {

	public static void main(String[] args) {
		BigBox bb = new BigBox();
		bb.printA();
//		bb.printB(); // ����õ
	
		/*
		 * No enclosing instance of type BigBox is accessible. 
		 * Must qualify the allocation with an enclosing instance of type BigBox 
		 * (e.g. x.new A() where x is an instance of BigBox).
		 */
		
		BigBox.printB(); // in a static way
		
		TinyBox tb = bb.new TinyBox();
		tb.show();
	}

}
