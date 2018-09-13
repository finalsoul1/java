class InstanceofTest {
	public static void main(String args[]) {
		FireEngine2 fe = new FireEngine2();

		System.out.println(fe instanceof FireEngine2);
		
		// fe ������ ����Ű�� ��ü�� FireEngine2 Ŭ���� ���赵�� ������°�?
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine2 instance.");
		} 

		// fe ������ ����Ű�� ��ü�� FireEngine2 Ŭ���� ���赵�� ����� ���ų� ��Ӱ��迡 ���Ͽ� Car2 �븩�� ������ �� �ִ°�?
		if(fe instanceof Car2) {
			System.out.println("This is a Car2 instance.");
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 

		System.out.println(fe.getClass().getName()); // Ŭ������ �̸��� ���
	}
} // class
class Car2 {}
class FireEngine2 extends Car2 {}
