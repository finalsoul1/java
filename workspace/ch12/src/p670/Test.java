package p670;

public class Test {
	public static void main(String[] args) {
		System.out.println(Calculator.add(2, 3));
		System.out.println(Calculator.add((int)2.0, 3));
		System.out.println(Calculator.add(2, (int)3.0F));
	}
}

class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}
//	public static double add(double a, int b) {
//		return a + b;
//	}
//	public static float add(int a, float b) {
//		return a + b;
//	}
}