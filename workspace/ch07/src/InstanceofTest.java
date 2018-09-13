class InstanceofTest {
	public static void main(String args[]) {
		FireEngine2 fe = new FireEngine2();

		System.out.println(fe instanceof FireEngine2);
		
		// fe 변수가 가르키는 객체는 FireEngine2 클래스 설계도로 만들었는가?
		if(fe instanceof FireEngine2) {
			System.out.println("This is a FireEngine2 instance.");
		} 

		// fe 변수가 가르키는 객체는 FireEngine2 클래스 설계도로 만들어 졌거나 상속관계에 의하여 Car2 노릇을 수행할 수 있는가?
		if(fe instanceof Car2) {
			System.out.println("This is a Car2 instance.");
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 

		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	}
} // class
class Car2 {}
class FireEngine2 extends Car2 {}
