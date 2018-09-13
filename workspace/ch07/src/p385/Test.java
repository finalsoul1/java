package p385;

public class Test {
	public static void main(String[] args) {
		Gildong g1 = new Gildong();
		g1.play();
		g1.fly();
		g1.swim();
		g1.doSomethingAfterMeal();

		Korean g2 = new Gildong();
		g2.play();
		((Gildong) g2).fly();
		((Gildong) g2).swim();
		((Gildong) g2).doSomethingAfterMeal();

		Flyable g3 = new Gildong();
		((Gildong) g3).play();
		g3.fly();
		((Gildong) g3).swim();
		((Gildong) g3).doSomethingAfterMeal();

//		Swimmable g4 = new Gildong();
//		g4.play();
//		g4.fly();
//		g4.swim();
//		g4.doSomethingAfterMeal();

		Jimae j1 = new Jimae();
		Korean j2 = new Jimae();
		Flyable j3 = new Jimae();

		// 날수 있는 객체들 다 모여봐봐!
		Flyable[] deliquent = { 
				new Gildong(), 
				new Jimae(), 
				new TomCruise() 
				};
		
		System.out.println();
		letsFly(deliquent);
		
		System.out.println();
		whyUseParamAsInterface(new Gildong());
		whyUseParamAsInterface(new Jimae());
//		whyUseParamAsInterface(new TomCruise());
		// 전달하고자 하는 파라미터 객체의 자료형이 바뀔 때 마다 메소드가 하나씩 추가되어야 하는 상황이다
	}

	private static void whyUseParamAsInterface(Flyable x) { // Flyable 인터페이스를 구현한 어떤 객체를 달라
		x.fly();
	}
	private static void whyUseParamAsInterface(Jimae x) {
		x.fly();
	}

	private static void letsFly(Flyable[] deliquent) {
		for (Flyable flyable : deliquent) {
			flyable.fly();
		}
	}
}
