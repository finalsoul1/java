class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);

		change(d.x);
		System.out.println("After change(d.x)");
		
		System.out.println("main() : x = " + d.x);
	}

	// Call by Value (���� ����)
	static void change(int x) {  // �⺻�� �Ű�����, int x = d.x = 10
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
