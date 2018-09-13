package p670;

public class Test2 {
	public static void main(String[] args) {
		Calculator2<Integer> calc = new Calculator2<Integer>();
		System.out.println(calc.add(2, 3));
		
		System.out.println(new Calculator2<Double>().add(2.0, 3.0));
		System.out.println(new Calculator2<Float>().add(2F, 3.0F));
	}
}

// (Type) : 취급하는 자료형을 사용자가 결정해야 한다
// 지네릭은 static이 안됨. main메소드보다 먼저 메모리에 올라가기 때문에
class Calculator2<T> {
	public T add(T a, T b) {
		return a;
	}
//	public static double add(double a, int b) {
//		return a + b;
//	}
//	public static float add(int a, float b) {
//		return a + b;
//	}
}