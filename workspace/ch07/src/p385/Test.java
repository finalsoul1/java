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

		// ���� �ִ� ��ü�� �� �𿩺���!
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
		// �����ϰ��� �ϴ� �Ķ���� ��ü�� �ڷ����� �ٲ� �� ���� �޼ҵ尡 �ϳ��� �߰��Ǿ�� �ϴ� ��Ȳ�̴�
	}

	private static void whyUseParamAsInterface(Flyable x) { // Flyable �������̽��� ������ � ��ü�� �޶�
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
